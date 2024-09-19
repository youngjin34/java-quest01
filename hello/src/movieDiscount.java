import java.util.Scanner;

public class movieDiscount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("나이를 입력하세요: ");
    int age = scanner.nextInt();

    System.out.print("구로 사시나요? >> yes / no: ");
    String region = scanner.next();

    System.out.print("통신사 할인이 있습니다. >> kt / lg / skt: ");
    String discount = scanner.next();

    double price = 0;

    if (age >= 5 && age <= 12) {
      price = 2000;
      System.out.println("어린이입니다.");
    } else if (age >= 13 && age <= 19) {
      price = 3000;
      System.out.println("청소년입니다.");
    } else if (age >= 20 && age <= 60) {
      price = 6000;
      System.out.println("성인입니다.");
    } else if (age >= 61) {
      price = 0;
      System.out.println("노인입니다.");
    }

    switch (discount) {
      case "kt":
        price *= 0.9;
        break;
      case "lg":
        price *= 0.87;
        break;
      case "skt":
        price *= 0.86;
        break;
    }

    if (region.equals("yes"))
      price *= 0.85;

    System.out.println(age >= 61 ? "무료입니다." : "최종 요금은 " + price + "원입니다.");
  }
}
