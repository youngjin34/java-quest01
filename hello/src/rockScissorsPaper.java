import java.util.Scanner;

public class rockScissorsPaper {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("나의 가위/바위/보 ==> ");
    String myRockScissorsPaper = scanner.next();

    int random = (int) (Math.random() * 3);
    String[] computer = { "가위", "바위", "보" };
    String computerRockScissorsPaper = computer[random];
    System.out.println("컴퓨터의 가위/바위/보 ==> " + computerRockScissorsPaper);

    if (myRockScissorsPaper.equals(computerRockScissorsPaper)) {
      System.out.println("비겼습니다....... ㅡㅡ");
    } else if (myRockScissorsPaper.equals("가위")) {
      if (computerRockScissorsPaper.equals("바위")) {
        System.out.println("졌습니다... ㅠㅠㅠ");
        return;
      } else if (computerRockScissorsPaper.equals("보")) {
        System.out.println("이겼습니다..!!! ^^");
        return;
      }
    } else if (myRockScissorsPaper.equals("보")) {
      if (computerRockScissorsPaper.equals("가위")) {
        System.out.println("졌습니다... ㅠㅠㅠ");
        return;
      } else if (computerRockScissorsPaper.equals("바위")) {
        System.out.println("이겼습니다..!!! ^^");
        return;
      }
    } else if (myRockScissorsPaper.equals("바위")) {
      if (computerRockScissorsPaper.equals("보")) {
        System.out.println("졌습니다... ㅠㅠㅠ");
        return;
      } else if (computerRockScissorsPaper.equals("가위")) {
        System.out.println("이겼습니다..!!! ^^");
        return;
      }
    }
  }
}