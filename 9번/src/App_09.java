import java.util.Scanner;

public class App_09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("카운트업 합니다.");
        System.out.print("양의 정숫값: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
