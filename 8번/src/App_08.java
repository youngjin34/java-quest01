import java.util.Scanner;

public class App_08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정숫값: ");
        int num = scanner.nextInt();

        int multiNum = 1;

        for (int i = 1; i <= num; i++) {
               multiNum *=  i;
        }
        
        System.out.println("1부터 " + num + "까지의 곱은 " + multiNum + "입니다");
    }
}
