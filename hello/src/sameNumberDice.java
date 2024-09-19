public class sameNumberDice {
  public static void main(String[] args) throws Exception {

    int[] dice1 = { 1, 2, 3, 4, 5, 6 };
    int[] dice2 = { 1, 2, 3, 4, 5, 6 };
    int[] dice3 = { 1, 2, 3, 4, 5, 6 };

    int count = 1;

    while (true) {
      int randomDice1 = dice1[(int) (Math.random() * 6)];
      int randomDice2 = dice2[(int) (Math.random() * 6)];
      int randomDice3 = dice3[(int) (Math.random() * 6)];

      count++;

      if (randomDice1 == randomDice2 && randomDice1 == randomDice3 && randomDice2 == randomDice3) {
        System.out.println("3개 주사위는 모두 " + randomDice1 + "입니다.");
        System.out.println("같은 숫자가 나올 때까지 " + count + "번 던졌습니다.");
        return;
      }
    }
  }
}