import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구한다.");
        System.out.print("n: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;

            if (i < num) {
                System.out.print(i + " + ");
            } else {
                System.out.println(i);
            }
        }

        System.out.println(" = " + sum);
    }
}
