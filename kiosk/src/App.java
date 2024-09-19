import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 첫 번째 화면 구성
        OrderPage orderPage = new OrderPage(primaryStage);
        Scene scene = new Scene(OrderPage.getRoot(), 700, 900);

        // 두 번째 화면 구성
        StackPane root2 = new StackPane();
        Button switchToScreen1Button = new Button("화면 1로 전환");
        root2.getChildren().add(switchToScreen1Button);

        // 화면 전환 로직
        Scene scene1 = new Scene(root1, 300, 200);
        Scene scene2 = new Scene(root2, 300, 200);

        switchToScreen2Button.setOnAction(e -> primaryStage.setScene(scene2));
        switchToScreen1Button.setOnAction(e -> primaryStage.setScene(scene1));

        primaryStage.setTitle("화면 전환 예제");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
