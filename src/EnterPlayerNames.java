import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class EnterPlayerNames {//controller for EnterPlayerNames.fxml

    @FXML
    private Pane EnterPlayerNamePane;

//    @FXML private Button saveButton;
    //OnAction: saveButtonPressed
    //fxID: saveButton
    
    
    @FXML private Button continueButton; //will transfer to game board
    //OnAction: continueButtonPressed?
    //fxID: continueButton
    
//    @FXML
//   private TextField pidTextBox;

    //Creating arraylist for users names to be input as players 1-4
    ArrayList<String> playerIds = new ArrayList<String>();
	//Name Spaces on "Enter Player Names" slide.
    
    public String[] getPlayerIDs() {//takes arraylist playerIDs created above, converting to array, making sure array size fits. 
    	String[] PlayerIDs = playerIds.toArray(new String[playerIds.size()]);
    	return PlayerIDs;
    }
    
    
    //MOVED ALL OF THIS TO SCENECONTROLLER
    
//    @FXML private Text pidOneLabel;
     
   // playerIds.add();
    
//    @FXML private Text pidTwoLabel;
//
//    @FXML private Text pidThreeLabel;
//
//    @FXML private Text pidFourLabel;
//    
//    @FXML private Label labelWarning;
    
    //add button 
//    @FXML
//    void saveButtonPressed(MouseEvent event) {//LIKELY NEEDS TO BE REDONE -- COME BACK TO
//		//Is textbox empty?
//    	System.out.println("motherrr");
//		Label labelresponse = new Label();
//		TextField text = new TextField();
//		
//		if (text.getText().isEmpty()) 
//		{
//			labelresponse.setText("Please enter a name.");
//		}
//		else 
//		{
//			String name = pidTextBox.getText();
//			playerIds.add(name);
//			
//			if(playerIds.size() == 1) {//Likely needs to be redone - COME BACK TO
//				pidOneLabel.setText(playerIds.get(0));
//			}
//			else if(playerIds.size() == 2) {
//				pidTwoLabel.setText(playerIds.get(1));
//			}
//			else if(playerIds.size() == 3) {
//				pidThreeLabel.setText(playerIds.get(2));
//			}
//			else if(playerIds.size() == 4) {
//				pidFourLabel.setText(playerIds.get(3));
//			}
////			if(playerIds.size() < 2 || playerIds.size() > 4) {
////				throw new IllegalArgumentException("Please enter a name."); 
////				
////			}
//		}
//    }

    @FXML
    void savePidMouseClick(MouseEvent event) {

    }
    
    @FXML void continueButtonPressed(ActionEvent event) {

    }

}
