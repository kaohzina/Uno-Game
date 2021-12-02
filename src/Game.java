import java.util.ArrayList;
import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class Game {

	private int currentPlayer; // player turn - whose turn is it?
	private String[] playerIds;// String array of names of players
	private DeckOfCards cards; // Cards should be the deck of objects from the Deck.java class
	private ArrayList<ArrayList<Card>> playerHand; // tracking player hands and players (two arrayLists)
	private ArrayList<Card> discardPile;
	boolean gameDirection;
	private Scene scene;


	/**
	 * DELAY is for the UNO! buttons after pid plays their currendDiscard. Limited
	 * amount of time to click the UNO! button before (2) additonal cards assigned
	 * to pid
	 */

	static final int DELAY = 45; // online search: timers for java, boolean var for "available"

	public Game(String[] pids, Scene scene) {
		this.scene = scene;
		currentPlayer = 0;// player one goes first
		gameDirection = false; // Standard game direction - going Left
		cards = new DeckOfCards();
		playerHand = new ArrayList<ArrayList<Card>>();// Should track all cards from all players
		discardPile = new ArrayList<Card>();

		playerIds = pids;// PlayerNames entered will be in the Game Class

		/**
		 * PlayerHands method
		 */

		// DEALING each player Hand (7) cards
		for (int i = 0; i < pids.length; i++) {
			ArrayList<Card> hand = new ArrayList<Card>(Arrays.asList(cards.drawCard(7)));// drawCard method to be
			// created in Deck.java
			playerHand.add(hand);
		}
		displayHand();
	}

	public void startGame(Game game) {

		//GammeDirection:


		while ((playerHand.get(0).size() * playerHand.get(1).size() *playerHand.get(2).size() * playerHand.get(3).size() != 0) {

			//STARTING GAME CONDITIONS
			Card card = cards.drawCard(1)[0];// drawCard() method to be created in deck (ONLY DRAWING SINGLE CARD)

			Card.Color sameColor = card.getColor();
			Card.Value sameValue = card.getValue();

			/**
			 * If starting value is: - Reverse - DrawTwo - WildDrawFour - Wild - Skip
			 * ...then we restart the game on the above conditions
			 */
			if (card.getValue() == Card.Value.DrawTwo || card.getValue() == Card.Value.DrawFour
					|| card.getValue() == Card.Value.Random || card.getValue() == Card.Value.Skip
					|| card.getValue() == Card.Value.Reverse)
				startGame(game);





			


		}
		
		

		if(discardPile[0].color || discardPile[0].value != cardPlayed.color || cardPlayer.value) {
			drawCard();
			NextPlayer();
		}

		if(discardPile[0].color || discardPile[0].value == cardPlayed.color || cardPlayer.value) {
			drawCard();

		}



			
			
			
			
			
			endGame();
			
			
		} // Values of cards not stated yet

		//Moving to SceneBuilder
	public void applyImage(String buttonID, Card card) {
		Button btn = (Button)scene.lookup("#" + buttonID);
		Image img = new Image( getClass().getResource(card.getAssetLocation()).toExternalForm());
		BackgroundSize bSize = new BackgroundSize(btn.getWidth(), btn.getHeight(), false, false, false, false);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, bSize);
		Background back = new Background(bImg);
		btn.setBackground(back);
		btn.setVisible(true);
	}
	
	public void applyCardBackImage(String buttonID) {
		Button btn = (Button)scene.lookup("#" + buttonID);
		Image img = new Image( getClass().getResource("/assets/Uno Game Assets/Card_Back.png").toExternalForm());
		BackgroundSize bSize = new BackgroundSize(btn.getWidth(), btn.getHeight(), false, false, false, false);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, bSize);
		Background back = new Background(bImg);
		btn.setBackground(back);
	}
	
	/**
	 * after dealing all the cards, we need to loop through the players hand to
	 * display each card
	 * playerHand.get(0) = the 0th player's hand
	 * because we're adding the images to the buttons in index order, when a card is
	 * removed from the hand,
	 * the images will automatically shift to the left
	 *
	 */
	

	public void displayHand() {
		for (int i = 0; i < 26; i++) {
			Button btn = (Button)scene.lookup("#card" + i);
			btn.setVisible(false);
		}
		
		for (int i = 0; i < playerHand.get(0).size(); i++) {
			applyImage("card" + i, playerHand.get(0).get(i));
		}
	}//displayHand() ends

	public void NextPlayer() {
		// clockwise
		if (gameDirection == false) {
			currentPlayer++;
			if (currentPlayer > 3) {
				currentPlayer = 0;
			}
		}
		if (gameDirection == true) {
			currentPlayer--;
			if (currentPlayer < 0) {
				currentPlayer = 3;
			}
		}
	}//NextPlayer Ends

	public cardRules() {
			/**if my "currentDiscard" played... '
			 * 
			 * currentDiscard.getValue() == latestDiscard.getValue() || currentDiscard.getColor() == latestDiscard.getColor(){
			 *
			 *}
			 * 
			 * Previous card is Red 4 (latestDiscard)
			 * I can play Red 6 || Blue 4
			 * 
			 * 
			 * 
			 */
	//		if(DeckOfCards.getValue() == )
		}// cardRules method ends

}// public class Game ends

	public endGame() {
		/**
		 * if (playerHand == 0){
		 * print in text field "pid won!"
		 */
		

		
	}//endGame

}// public class game method ends
