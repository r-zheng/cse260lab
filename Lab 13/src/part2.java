import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class part2 extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	public void start(Stage primaryStage)
	{
		Polyline polyline = new Polyline();
		ObservableList list = polyline.getPoints();
		double scaleFactor = 0.0125;
		for (int x = -200; x <= 200; x++)
		{
			list.add(x + 300.0);
			list.add(700 - scaleFactor * x * x);
		}
		
		Pane pane = new Pane();
		
		pane.getChildren().add(polyline);
		
		Scene scene = new Scene(pane, 600, 800);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
