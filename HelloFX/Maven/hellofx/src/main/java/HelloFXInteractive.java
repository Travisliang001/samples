import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFXInteractive extends Application {

    @Override
    public void start(Stage stage) {
        // Create a label to display text
        Label label = new Label("Hello, JavaFX!");

        // Create a button that will change the text of the label when clicked
        Button button = new Button("Click Me!");
        
        // Add an event handler to the button to change the label text when clicked
        button.setOnAction(e -> label.setText("Hello, JavaFX! You clicked the button."));

        // Set up the layout with the label and the button
        StackPane root = new StackPane();
        root.getChildren().addAll(label, button);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);

        // Title of the window
        stage.setTitle("Hello, Interactive JavaFX!");

        // Show the stage (application window)
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
