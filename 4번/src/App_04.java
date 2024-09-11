import java.util.Scanner;

public class App_04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("양의 정수값: ");
            num = scanner.nextInt();
        } while (num < 0);

        // for (int i = num; i >= 0; i--) {
        //     System.out.println(i);
        // }

        while (num >= 0) {
            System.out.println(num);
            num--;
        }
    }
}
