import java.util.Scanner;

public class studentLine {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("학생은 몇 명입니까??? ==> ");
    int student = scanner.nextInt();

    int num = 1;

    for (int i = 1; i <= student; i++) {
      num *= i;
    }

    System.out.println(student + "명의 학생들을 순서대로 세우는 경우의 수 : " + num);

  }
}