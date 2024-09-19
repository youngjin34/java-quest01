import java.time.LocalTime;
import java.util.Scanner;

public class pcEx {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    LocalTime now = LocalTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();

    while (true) {
      System.out.print("나이 입력 ==> ");
      int age = scanner.nextInt();

      if (hour > 10 && minute >= 0 && second >= 0) {
        if (age >= 20) {
          System.out.println("즐거운 시간 보내세요.^^");
          System.out.println("협조 감사합니다.");
        } else {
          System.out.println("미성년자는 10시 이후 사용할 수 없습니다.");
        }
      }
    }

  }
}