import javafx.animation.PathTransition; 
import javafx.application.Application;
import javafx.animation.Animation.Status;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;


public class FlagRisingAnimation extends Application {
	@Override 
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
	
		ImageView imageView = new ImageView("image/us.gif");
		pane.getChildren().add(imageView);
		PathTransition pt = new PathTransition(Duration.millis(10000),
		new Line(100, 200, 100, 0), imageView);
		pt.setCycleCount(5);

		Thread thread1 = new Thread(new Runnable(){
			@Override
			public void run(){
				pt.play();
						}
					});
		thread1.run();
	
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 200); 
		primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}