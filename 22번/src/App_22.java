import java.util.Scanner;

public class App_22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int group = 0;
        int sum = 0;
        int num;

        System.out.println("정수를 더합니다.");
        while (true) {
            group++;
            System.out.println(group + "group");
            while (true) {
                System.out.println("정수: ");
                num = scanner.nextInt();
                if (num == 88888) {
                    break;
                } else if (num == 99999) {
                    System.out.println("합계는 " + sum + "입니다.");
                    return;
                }
                sum += num;
            }
            
        }
    }
}
