import java.util.Scanner;

public class App_15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다");
        // System.out.print("단수는 : ");
        // int num = scanner.nextInt();

        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다");
        // System.out.print("단수는 : ");
        // int num = scanner.nextInt();

        // for (int i = 0; i < num; i++) {
        //     for (int j = 0; j < num - i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        // System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다");
        // System.out.print("단수는 : ");
        // int num = scanner.nextInt();

        // for (int i = 0; i < num; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < num - i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다");
        System.out.print("단수는 : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
