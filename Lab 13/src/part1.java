import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class part1 extends Application
{	
	public static void main(String[] args)
	{
		launch(args);
	}

	public void start(Stage primaryStage)
	{
		Circle circle1 = new Circle((int)(Math.random() * 1000), (int)(Math.random() * 500), 15);
		Circle circle2 = new Circle((int)(Math.random() * 1000), (int)(Math.random() * 500), 15);
		
		Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
		
		Text text = new Text((circle1.getCenterX() + circle2.getCenterX()) / 2,
								(circle1.getCenterY() + circle2.getCenterY()) / 2,
								Double.toString(getLineLength(line)));
		
		Pane pane = new Pane();
		
		pane.getChildren().add(circle1);
		pane.getChildren().add(circle2);
		pane.getChildren().add(line);
		pane.getChildren().add(text);
		
		Scene scene = new Scene(pane, 1000, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static double getLineLength(Line line)
	{
		double xSize = line.getStartX() - line.getEndX();
		double ySize = line.getStartY() - line.getEndY();
		return Math.sqrt((ySize * ySize) + (xSize * xSize));
	}
}
