import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TrafficLights extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	public void start(Stage mainStage)
	{

		BorderPane pane = new BorderPane();

		VBox radioButtons = new VBox(100);

		RadioButton redButton = new RadioButton("Red");
		RadioButton yellowButton = new RadioButton("Yellow");
		RadioButton greenButton = new RadioButton("Green");
		radioButtons.getChildren().addAll(redButton, yellowButton, greenButton);
		pane.setLeft(radioButtons);
		ToggleGroup group = new ToggleGroup();
		redButton.setToggleGroup(group);
		yellowButton.setToggleGroup(group);
		greenButton.setToggleGroup(group);
		
		VBox lights = new VBox(40);
		Circle redLight = new Circle(100, 100, 40);
		Circle yellowLight = new Circle(100, 200, 40);
		Circle greenLight = new Circle(100, 300, 40);
		lights.getChildren().addAll(redLight, yellowLight, greenLight);
		redLight.setFill(Color.WHITE);
		yellowLight.setFill(Color.WHITE);
		greenLight.setFill(Color.WHITE);

		redButton.setOnAction(e -> {
			if(redButton.isSelected())
			{
				redLight.setFill(Color.RED);
				yellowLight.setFill(Color.WHITE);
				greenLight.setFill(Color.WHITE);
			}
		});

		yellowButton.setOnAction(e -> {
			if(yellowButton.isSelected())
			{
				redLight.setFill(Color.WHITE);
				yellowLight.setFill(Color.YELLOW);
				greenLight.setFill(Color.WHITE);
			}
		});

		greenButton.setOnAction(e -> {
			if(greenButton.isSelected())
			{
				redLight.setFill(Color.WHITE);
				yellowLight.setFill(Color.WHITE);
				greenLight.setFill(Color.GREEN);
			}
		});
		pane.setRight(lights);
		
		Scene scene = new Scene(pane);
		mainStage.setScene(scene);
		mainStage.show();
	}

}
