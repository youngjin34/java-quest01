import java.util.Arrays;
import java.util.Scanner;

public class arrayEx5_10 {
  public static void main(String[] args) throws Exception {

    String[][] words = {
        { "hacdj", "djshjklaf" },
        { "computer", "컴퓨터" },
        { "integer", "정수" }
    };

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i][0]);

      String tmp = scanner.nextLine();

      if (tmp.equals(words[i][1])) {
        System.out.println("정답");
      } else {
        System.out.println("틀렸");
      }
    }

  }
}