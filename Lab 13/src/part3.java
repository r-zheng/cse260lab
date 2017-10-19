import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class part3 extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	public void start(Stage primaryStage)
	{
		double scaleFactor = 50;
		
		Polyline sin = new Polyline();
		ObservableList sinList = sin.getPoints();
		for (int x = -170; x <= 170; x++)
		{
			sinList.add(x + 200.0);
			sinList.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		
		Polyline cos = new Polyline();
		ObservableList cosList = cos.getPoints();
		for (int x = -170; x <= 170; x++)
		{
			cosList.add(x + 200.0);
			cosList.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
		}
		
		sin.setStroke(Color.RED);
		cos.setStroke(Color.BLUE);
		
		Pane pane = new Pane();
		
		pane.getChildren().add(sin);
		pane.getChildren().add(cos);
		
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
