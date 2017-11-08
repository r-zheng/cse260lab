import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestPart2 extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	public void start(Stage mainStage)
	{
		Histogram histo = new Histogram();
		Pane pane = new Pane();
		pane.getChildren().add(histo);
		Scene scene = new Scene(pane);
		mainStage.setScene(scene);
		mainStage.show();
	}
	
	
}
