import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class javaFx extends Application {
  @Override
  public void start(Stage primaryStage) {
    Button okBtn = new Button("OK");
    Scene scene = new Scene(okBtn, 200, 250);
    primaryStage.setTitle("JavaFx");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
