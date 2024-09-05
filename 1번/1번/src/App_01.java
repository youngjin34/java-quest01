import java.util.Scanner;

public class App_01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
          System.out.print("세 자리의 정숫값: ");
          int number = scanner.nextInt();
          int length = (int)(Math.log10(number) + 1);

          if (length == 3) {
            System.out.println("입력한 값은 " + number + "입니다.");
            break;
          }
        }
    }
}