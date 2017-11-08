import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Part1 extends Application
{
	TreeSet<Double> circleXs = new TreeSet<Double>();
	TreeSet<Double> circleYs = new TreeSet<Double>();
	Rectangle rect = new Rectangle();
	private static int RADIUS = 10;
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void start(Stage primaryStage)
	{
		Pane pane = new Pane();
		pane.getChildren().add(rect);
		pane.setOnMouseClicked(e -> {
			double circleX = e.getX();
			double circleY = e.getY();
			if(e.getButton() == MouseButton.PRIMARY)
				newCircle(pane, circleX, circleY);
		});
		
		Scene scene = new Scene(pane, 2000, 1200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void newCircle(Pane pane, double circleX, double circleY)
	{
		
		Circle circle = new Circle(circleX, circleY, RADIUS);
		pane.getChildren().add(circle);
		updateBound(circle, true);
		circle.setOnMouseClicked(e -> {
			if(e.getButton() == MouseButton.SECONDARY)
			{
				pane.getChildren().remove(circle);
				updateBound(circle, false);
			}
			
		});
	}

	private void updateBound(Circle circle, boolean adding)
	{
		if(adding)
		{
			circleXs.add(circle.getCenterX());
			circleYs.add(circle.getCenterY());
		}
		else
		{
			circleXs.remove(circle.getCenterX());
			circleYs.remove(circle.getCenterY());
		}
		rect.setX(circleXs.first());
		rect.setY(circleYs.first());
		rect.setWidth(circleXs.last() - circleXs.first());
		rect.setHeight(circleYs.last() - circleYs.first());
		
	}
}
