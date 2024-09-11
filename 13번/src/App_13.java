import java.util.Scanner;

public class App_13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int month;
        
        while (true) {
            System.out.println("계절을 찾습니다.");
            System.out.print("몇 월입니까? ");
            month = scanner.nextInt();

            if (month < 1 || month > 12) {
                continue;
            }

            if (month == 12 || month == 1 || month == 2) {
                System.out.println("겨울입니다.");
            } else if (month >= 3 && month <= 5) {
                System.out.println("봄입니다.");
            } else if (month >= 6 && month <= 9) {
                System.out.println("여름입니다.");
            } else if (month >= 10 && month <= 11) {
                System.out.println("가을입니다.");
            }
            
            System.out.print("다시 하시겠습니까? 1_Yes/0_No >> ");
            int retry = scanner.nextInt();

            if (retry == 0) {
                System.out.println("종료합니다.");
                return;
            } else if (retry == 1) {
                continue;
            }
        }
    }
}
