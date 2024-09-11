import java.util.Scanner;

public class App_17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("피라미드를 표시합니다.");
        System.out.print("단수는? ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }
}
