import java.util.Scanner;

public class turtleMap {
  public static void main(String[] args) throws Exception {

    Turtle turtle = new Turtle();
    int angle, distance, curX, curY;

    turtle.speed(500);
    turtle.setCanvasSize(300, 300);
    turtle.width(5);
    turtle.penColor("blue");

    while (true) {
      angle = (int) (Math.random() * 360);
      distance = (int) (Math.random() * 90 + 10);

      turtle.right(angle);
      turtle.forward(distance);

      curX = (int) turtle.getX();
      curY = (int) turtle.getY();

      if ((curX >= -150 && curX <= 150) && (curY >= -159 && curY <= 150)) {
        System.out.println("Good Boy");
      } else {
        turtle.setPosition(0, 0);
      }

    }

  }
}