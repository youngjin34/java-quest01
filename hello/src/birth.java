import java.util.Scanner;

public class birth {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("출생 연도를 입력하세요 ==> ");
    int myBirth = scanner.nextInt();

    int tti = myBirth % 12;

    switch (tti) {
      case 0:
        System.out.println("원숭이띠입니다.");
        break;
      case 1:
        System.out.println("닭띠입니다.");
        break;
      case 2:
        System.out.println("개띠입니다.");
        break;
      case 3:
        System.out.println("돼지띠입니다.");
        break;
      case 4:
        System.out.println("쥐띠입니다.");
        break;
      case 5:
        System.out.println("소띠입니다.");
        break;
      case 6:
        System.out.println("범띠입니다.");
        break;
      case 7:
        System.out.println("토끼띠입니다.");
        break;
      case 8:
        System.out.println("용띠입니다.");
        break;
      case 9:
        System.out.println("뱀띠입니다.");
        break;
      case 10:
        System.out.println("말띠입니다.");
        break;
      case 11:
        System.out.println("양띠입니다.");
        break;
      default:
        break;
    }

  }
}