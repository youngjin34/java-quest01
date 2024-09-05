import java.util.Scanner;

public class App_02 {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("제한 횟수 >> ");
      int chance = scanner.nextInt();

      // int randomNumber = ((int)(Math.random() * 99) + 10);
      int randomNumber = (int)(Math.random() * 99);
        
        System.out.println("숫자 맞추기 게임 시작!");
        // System.out.println("10부터 99사이의 숫자를 맞추세요.");
        System.out.println("0부터 99사이의 숫자를 맞추세요.");
        
        // 2-1 문제
        // do {
        //   System.out.print("어떤 숫자 일까?");
        //   int input = scanner.nextInt();

        //   if (input > 99 || input < 10) {
        //     System.out.println("10부터 99까지의 숫자를 입력해주세요");
        //     continue;
        //   }

        //   if (input == randomNumber) {
        //     System.out.println("정답입니다");
        //     break;
        //   }

        //   if (input > randomNumber) {
        //     System.out.println("더 작은 숫자입니다.");
        //   } else if (input < randomNumber) {
        //     System.out.println("더 큰 숫자입니다.");
        //   } 
        // } while (true);


        // 2-2 문제
        do {
          System.out.print("어떤 숫자 일까?");
          int input = scanner.nextInt();

          if (input > 99 || input < 10) {
            System.out.println("10부터 99까지의 숫자를 입력해주세요");
            continue;
          }

          if (input == randomNumber) {
            System.out.println("정답입니다");
            break;
          }

          if (input > randomNumber) {
            System.out.println("더 작은 숫자입니다.");
          } else if (input < randomNumber) {
            System.out.println("더 큰 숫자입니다.");
          } 

          --chance;

          if (chance == 0) {
            System.out.println("기회가 모두 소진되었습니다.");
            break;
          }

        } while (true);
    }
}
