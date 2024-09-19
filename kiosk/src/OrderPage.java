import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class OrderPage {

  private StackPane root;
  private Button switchToScreen2Button;

     OrderPage(Stage primar
    root = new StackPane();
    switchToScreen2Button = new Button("화면 2로 전환")
      root.getChildren().add(switchToScreen2Button);
    }

  public StackPane getRoot() {
    return root;
  }

  public Button getSwitchToScreen2Button() {
    return switchToScreen2Button;
  }
}
