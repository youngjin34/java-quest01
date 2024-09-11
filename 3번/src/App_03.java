import java.util.Scanner;

public class App_03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("첫 번째 숫자를 입력하세요 >> ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 >> ");
        int num2 = scanner.nextInt();

        
      if (num1 < num2) {
        for (int i = num1; i <= num2; i++) {
          System.out.print(i + " ");
        }
      } else if (num1 > num2) {
        for (int i = num2; i <= num1; i++) {
          System.out.print(i + " ");
        }
      }
    }
}
