import java.util.Scanner;

public class App_12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정숫값 : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i + "의 제곱은" + i * i + "입니다.");
        }

    }
}
