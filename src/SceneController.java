import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;


//Work in progress - there are Errors when running the GUI



public class SceneController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//Uno Main Menu "Start Button" functionality
	@FXML public void startButtonLoadNameScreen(ActionEvent event) throws IOException {//surround with try and catch block is what IOException does
		Parent root = FXMLLoader.load(getClass().getResource("EnterPlayerNames.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	//Uno Main Menu "Exit Button" functionality
	@FXML public void exitButton(ActionEvent event) throws IOException {
		System.exit(0); //WORKING ON SETTING ALERT CONFIRMATION
	}
	
	//Enter Player Names "Add/Save Names Button" functionality
	@FXML public void saveButtonPressed(ActionEvent event) throws IOException {//This is not working

		
	}
	
	//Enter Player Names "Continue Button" functionality
	@FXML public void continueButtonPressed(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//GameBoard "Exit Button" functionality
	@FXML public void gameBoardExit(ActionEvent event) throws IOException {
		System.exit(0); //WORKING ON SETTING ALERT CONFIRMATION
	}
	
	
    

	
	
	
	
	
}