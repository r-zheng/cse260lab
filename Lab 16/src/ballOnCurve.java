import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ballOnCurve extends Application
{
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void start(Stage primaryStage)
	{
		Pane pane = new Pane();
		
		Polyline sin = new Polyline();
		ObservableList<Double> sinList = sin.getPoints();
		for (int x = -170; x <= 170; x++)
		{
			sinList.add(x + 200.0);
			sinList.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		
		Circle circle = new Circle(10.0);
		pane.getChildren().add(sin);
		pane.getChildren().add(circle);
			
		PathTransition pt = new PathTransition();
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setInterpolator(Interpolator.LINEAR);
		pt.setPath(sin);
		pt.setNode(circle);
		pt.setDuration(Duration.millis(5000));
		pt.play();
		
		pane.setOnMouseClicked(e -> {
			if(e.getButton() == MouseButton.PRIMARY)
			{
				pt.play();
			}
			else if(e.getButton() == MouseButton.SECONDARY)
			{
				pt.pause();
			}
		});
		
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
