import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Uno extends Application {//Uno game is run from this class
	//sets the first scene as the Uno menu
	
	//Still work in progress - there are Errors in running the GUI

	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Uno.fxml"));
			Scene scene1 = new Scene(root);
			stage.setScene(scene1);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}