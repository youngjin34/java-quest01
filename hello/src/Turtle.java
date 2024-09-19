import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Turtle {
  private int x, y; // 거북이의 현재 위치
  private double angle; // 거북이의 이동 각도
  private int speed; // 속도
  private Color penColor; // 펜의 색상
  private int penWidth; // 펜의 두께
  private JPanel canvas; // 그려질 캔버스

  public Turtle() {
    this.x = 150; // 초기 위치 (0, 0)
    this.y = 150;
    this.angle = 0;
    this.speed = 1;
    this.penColor = Color.BLUE;
    this.penWidth = 1;

    // 캔버스 설정
    this.canvas = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(penColor);
        g.fillOval(x - penWidth / 2, y - penWidth / 2, penWidth, penWidth);
      }
    };
  }

  public void setCanvasSize(int width, int height) {
    JFrame frame = new JFrame("Turtle Graphics");
    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(canvas);
    frame.setVisible(true);
  }

  public void setPosition(int x, int y) {
    this.x = x;
    this.y = y;
    canvas.repaint();
  }

  public void forward(int distance) {
    int newX = (int) (x + Math.cos(Math.toRadians(angle)) * distance);
    int newY = (int) (y + Math.sin(Math.toRadians(angle)) * distance);

    // 선 그리기
    Graphics g = canvas.getGraphics();
    g.setColor(penColor);
    g.drawLine(x, y, newX, newY);

    x = newX;
    y = newY;

    canvas.repaint();
  }

  public void right(int degrees) {
    angle += degrees;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void speed(int speed) {
    this.speed = speed;
  }

  public void penColor(String color) {
    switch (color.toLowerCase()) {
      case "blue":
        this.penColor = Color.BLUE;
        break;
      case "red":
        this.penColor = Color.RED;
        break;
      case "green":
        this.penColor = Color.GREEN;
        break;
      default:
        this.penColor = Color.BLACK;
        break;
    }
  }

  public void width(int width) {
    this.penWidth = width;
  }
}
