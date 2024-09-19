import java.util.Arrays;

public class arrayEx {
  public static void main(String[] args) throws Exception {

    int[] scores = { 100, 90, 20, 30, 50, 54 };
    int sum = 0;

    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    double average = sum / 5;
    System.out.println(average);
    System.out.println(Arrays.toString(scores));
  }
}