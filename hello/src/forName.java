
public class forName {
  public static void main(String[] args) throws Exception {
    Loop1: for (int i = 2; i < 9; i++) {
      for (int j = 1; j < 9; j++) {
        if (j == 5) {
          // break Loop1;
          break;
        }
        System.out.println(i + "*" + j + "=" + i * j);
      }
      System.out.println();
    }

  }
}