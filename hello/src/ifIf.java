import java.util.Scanner;

public class ifIf {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("첫 비밀번호를 네 자리 입력하세요 : ");
    int password1 = scanner.nextInt();
    int password2 = scanner.nextInt();
    int password3 = scanner.nextInt();
    String password4 = scanner.next();

    System.out.print("비밀번호를 입력하세요 : ");
    int confirmPassword1 = scanner.nextInt();
    int confirmPassword2 = scanner.nextInt();
    int confirmPassword3 = scanner.nextInt();
    String confirmPassword4 = scanner.next();

    if (password1 == confirmPassword1) {
      if (password2 == confirmPassword2) {
        if (password3 == confirmPassword3) {
          if (password4.equals(confirmPassword4)) {
            System.out.println("문을 열어드립니다.");
          } else {
            System.out.println("비밀번호가 다릅니다.");
          }
        } else {
          System.out.println("비밀번호가 다릅니다.");
        }
      } else {
        System.out.println("비밀번호가 다릅니다.");
      }
    } else {
      System.out.println("비밀번호가 다릅니다.");
    }

  }
}