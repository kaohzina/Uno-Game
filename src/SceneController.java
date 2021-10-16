import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;


//Work in progress - there are Errors when running the GUI



public class SceneController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	

	public void startButtonLoadNameScreen(ActionEvent event) throws IOException {//surround with try and catch block is what IOException does
		Parent root = FXMLLoader.load(getClass().getResource("EnterPlayerNames.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void saveButtonPressed(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}