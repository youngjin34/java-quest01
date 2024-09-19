import java.util.Scanner;

public class App_06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개를 표시할까요? : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("+");
            }
        }
    }
}
