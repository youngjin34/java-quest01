import java.util.Scanner;

public class computerNumber {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int count = 1;

    int computerNumber = (int) (Math.random() * 5) + 1;

    while (true) {

      System.out.print("게임 " + count + "회 : 컴퓨터가 생각한 숫자는? ");
      int myNumber = scanner.nextInt();

      if (computerNumber == myNumber) {
        System.out.println("맞혔네요. 축하합니다!!");
        System.out.println("게임을 마칩니다.");
        return;
      } else {
        count++;
      }
    }
  }
}