import java.util.Scanner;

public class App_05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 *을 표시할까요? : ");
        int num = scanner.nextInt();

        if (num >= 1) {
            // for 문
            // for (int i = 0; i < num; i++) {
            //     System.out.print("*");
            // }

            // while 문
            while (num > 0) {
                System.out.print("*");
                num--;
            }
        }

        System.out.println();

    }
}
