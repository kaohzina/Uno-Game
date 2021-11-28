import java.awt.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

//An alert pop-up that you have to interact with to close
public class ConfirmWindow {

	static boolean answer;
	
	public static boolean display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(300);
		Text label1 = new Text();
		label1.setText(message);
		
		//Create two buttons
		Button yesButton = new Button("Yes");
		Button noButton = new Button("No");
		
		yesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
		});
		
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(yesButton, noButton);
		layout.getChildren().addAll(label1);
		layout.setAlignment(Pos.CENTER);
		Scene scene1 = new Scene(layout);
		window.setScene(scene1);
		window.showAndWait();
		
		return answer;
		
		
	}
	
	
}
