import java.util.Scanner;

public class whileEx {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    String answer;

    do {
      System.out.println("살고 있는 곳이 어디니??????????  ");
      String region = scanner.next();
      System.out.println("나는 " + region + "에 살아~~");
      System.out.println("계속 할까요? >> yes / no");

      answer = scanner.next();
      System.out.println("계속 진행");
    } while (answer.equals("yes"));
  }
}