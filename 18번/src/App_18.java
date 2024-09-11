import java.util.Scanner;

public class App_18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("2이상의 정숫값: ");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("소수가 아닙니다.");
        }

        if (num == 2) {
            System.out.println("소수입니다.");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }

        System.out.println("소수입니다.");
    }
}
