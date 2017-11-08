import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class pendulum extends Application
{
	private double supportX = 300;
	private double supportY = 50;
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception
	{
		Pane pane = new Pane();
		
		Double theta;
		Polyline path = new Polyline();
		ObservableList<Double> pathList = path.getPoints();
		for (int t = 0; t < 1000; t++)
		{
			theta = .5 * Math.cos(Math.sqrt(9.81 / 0.994) * t / 1000);
			pathList.add(500 * 0.994 * Math.sin(theta) + supportX);
			pathList.add(500 * 0.994 * Math.cos(theta) + supportY);
		}
		
		Circle circle = new Circle(10.0);
		Circle support = new Circle(supportX, supportY, 10.0);
		
		Line line = new Line();
		line.setStartX(supportX);
		line.setStartY(supportY);
		line.endXProperty().bind(circle.translateXProperty());
		line.endYProperty().bind(circle.translateYProperty());
		
		pane.getChildren().add(path);
		pane.getChildren().add(circle);
		pane.getChildren().add(support);
		pane.getChildren().add(line);
		
		Scene scene = new Scene(pane);
		
		PathTransition pt = new PathTransition();
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setInterpolator(Interpolator.EASE_BOTH);
		pt.setAutoReverse(true);
		pt.setPath(path);
		pt.setNode(circle);
		pt.setDuration(Duration.millis(2000));
		pt.play();
		
		scene.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.UP)
			{
				pt.setRate(pt.getCurrentRate() * 2);
			}
			if(e.getCode() == KeyCode.DOWN)
			{
				pt.setRate(pt.getCurrentRate() / 2);
			}
		});
		

		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
