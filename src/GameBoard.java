
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class GameBoard {

	@FXML private Button cardOne;


	//get card image to show up on a button 
	//look at coverviewer
	
	
	//save states that save players progress?
	
	
	
	
@FXML public void cardOnePressed(ActionEvent event) throws IOException {
		Image img = new Image(Cards.getAssetLocation());
		ImageView view = new ImageView(img);
		cardOne.setGraphic(view);
	}
	
}
