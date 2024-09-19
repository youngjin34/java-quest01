import java.util.Scanner;

public class forEx {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("시를 입력해주세요");
    int hours = scanner.nextInt();
    System.out.println("분을 입력해주세요");
    int minutes = scanner.nextInt();
    System.out.println("초를 입력해주세요");
    int seconds = scanner.nextInt();

    // for (int i = 1; i <= 12; i++) {
    // for (int j = 1; j <= 60; j++) {
    // for (int k = 1; k <= 60; k++) {
    // Thread.sleep(1000);
    // System.out.printf("%d 시 : %d 분 : %d 초\n", i, j, k);
    // if (hours == i && minutes == j && seconds == k) {
    // System.out.println("김광성이 부릅니다 일어나!!!!!!!!!!!!!!");
    // return;
    // }
    // }
    // }
    // }

    int a = 1;
    int b = 1;
    int c = 1;

    while (a <= 12) {
      while (b <= 60) {
        while (c <= 60) {
          Thread.sleep(1000);
          System.out.printf("%d 시 : %d 분 : %d 초\n", a, b, c);

          if (hours == a && minutes == b && seconds == c) {
            System.out.println("김광성이 부릅니다 일어나!!!!!!!!!!!!!!");
            return;
          }
          c++;
        }
        c = 1; // 초기화 안 시키면 60 넘어갔을 때 종료됨........
        b++;
      }
      b = 1;
      a++;
    }

  }
}