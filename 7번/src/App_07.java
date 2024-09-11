import java.util.Scanner;

public class App_07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("양의 정시값의 자릿수를 표시합니다.");
        System.out.print("양의 정숫값: ");
        int num = scanner.nextInt();
        int length = (int)(Math.log10(num) + 1);

        System.out.println("입력한 숫자는 " + length +"자리입니다.");
    }
}
