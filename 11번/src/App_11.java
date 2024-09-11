import java.util.Scanner;

public class App_11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("몇 cm부터: ");
        double start = scanner.nextDouble();

        System.out.print("몇 cm까지: ");
        double end = scanner.nextDouble();

        System.out.print("몇 cm 단위: ");
        int step = scanner.nextInt();

        System.out.println("신장 표준 체중");
        System.out.println("------------------");

        double weight;

        for (double i = start; i < end; i+=step) {
            weight = (i - 100) * 0.9;
            System.out.printf("%f %.1f\n", i, weight);
        }
    }
}
