import java.util.Scanner;

public class App_20 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?: ");
        int count = scanner.nextInt();

        int sum = 0;
        int inputNumber = 0; // 몇 개 계산하는 지
        
        for (int i = 0; i < count; i++) {
            System.out.println("정수(0으로 종료): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (sum + num > 1000) {
                System.out.println("합계가 1000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                break;
            }

            sum += num;
            inputNumber++;
            
        }


        if (inputNumber > 0) {
            double average = (double) sum / inputNumber;
            System.out.println("합계는 " + sum + "입니다.");
            System.out.println("평균은 " + average + "입니다.");
        } else {
            return;
        }

    }
}
