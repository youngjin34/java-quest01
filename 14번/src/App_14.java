import java.util.Scanner;

public class App_14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정방향을 표시합니다.");
        System.out.print("단수는 : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
