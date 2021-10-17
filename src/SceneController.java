import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
	
    ArrayList<String> playerIds = new ArrayList<String>();
    
    @FXML private Button addButton;
    @FXML private TextField pidTextBox;
    @FXML private Text pidOneLabel;
    @FXML private Text pidTwoLabel;
    @FXML private Text pidThreeLabel;
    @FXML private Text pidFourLabel;
    @FXML private Label labelWarning;
	
    
    
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
		Boolean answer = ConfirmWindow.display("UNO! Game", "Are you sure you want to exit?");
		if(answer) {
			System.exit(0);
		}
	}
	
	//Enter Player Names "Add/Save Names Button" functionality
	@FXML public void saveButtonPressed(ActionEvent event) throws IOException {//This is not working
		String name = pidTextBox.getText();
		//Is textbox empty?
		if (name.isEmpty()) 
		{
			labelWarning.setText("Please enter a name.");
		} 
		else 
		{
			playerIds.add(name);
			
			if(playerIds.size() == 1) {
				pidOneLabel.setText(playerIds.get(0));
			}
			else if(playerIds.size() == 2) {
				pidTwoLabel.setText(playerIds.get(1));
			}
			else if(playerIds.size() == 3) {
				pidThreeLabel.setText(playerIds.get(2));
			}
			else if(playerIds.size() == 4) {
				pidFourLabel.setText(playerIds.get(3));
			}

		}
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
		System.exit(0); 
	}
	
	
    

	
	
	
	
	
}