// Card shuffling and dealing with collections method shuffle.

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;

class Card {

	
	/**
	 * @author jacks
	 * If we need enum to string, this can be converted through a toString() method
	 */
	
	
	public enum Value 
	{
		Zero, 
		One, 
		Two, 
		Three, 
		Four, 
		Five, 
		Six, 
		Seven, 
		Eight, 
		Nine, 
		DrawTwo, 
		Skip, 
		Reverse, 
		Random, //regular wild
		DrawFour //wild draw four
	}

	public enum Color 
	{
		Red, 
		Blue, 
		Green, 
		Yellow, 
		Wild
	}

	private final Value value;
	private final Color color;

	// constructor
	public Card(Value value, Color color) {
		this.value = value;
		this.color = color;

	}

	// return face of the card
	public Value getValue() {
		return value;
	}

	// return suit of Card
	public Color getColor() {
		return color;
	}

	// return String representation of Card
	/**
	 * //Rename some of the card.pngs 
	 */
	public String toString() {
		return String.format("%s_%s", color, value);//Rename some of the card.pngs (WildCards need to change)
	}
	
	//image
	public String getAssetLocation() {
		return "/assets/Uno Game Assets/" + this.toString() + ".png";
	}
}

// class DeckOfCards declaration
public class DeckOfCards {
	private ArrayList<Card> list; // declare List that will store Cards

	// set up deck of Cards and shuffle
	public DeckOfCards() {
		// had to change list to an ArrayList because
		// the Arrays.asList function was making the list unmodifiable
		list = new ArrayList<Card>();
		//Range 0
		EnumSet<Card.Value> valueRange0 = EnumSet.range(Card.Value.Zero, Card.Value.Zero);

		//1-Reverse card objects in range			
		EnumSet<Card.Value> valueRange1 = EnumSet.range(Card.Value.One, Card.Value.Reverse);
		
		//
		EnumSet<Card.Value> valueRange2 = EnumSet.range(Card.Value.Random, Card.Value.DrawFour);

		EnumSet<Card.Color> colorRange1 = EnumSet.range(Card.Color.Red, Card.Color.Yellow);
		//
		EnumSet<Card.Color> colorRange2 = EnumSet.range(Card.Color.Wild, Card.Color.Wild);

		
		//object for 0
		for(Card.Color color : colorRange1 ) {//: = "take one item from the list at a time"
			for(Card.Value value : valueRange0) {
				list.add(new Card(value, color));
			}
		}
		
		//printing 1-Reverse
		for(Card.Color color : colorRange1 ) {//: = "take one item from the list at a time"
			for(Card.Value value : valueRange1) {
				list.add(new Card(value, color));
				list.add(new Card(value, color));
			}
		}
		//printing the wilds
		for(Card.Color color : colorRange2 ) {//: = "take one item from the list at a time"
			for(Card.Value value : valueRange2) {
				list.add(new Card(value, color));
				list.add(new Card(value, color));
				list.add(new Card(value, color));
				list.add(new Card(value, color));
			}
		}




		
		Collections.shuffle(list); // shuffle deck
	}

	// output deck
	public void printcards() {
		// display 52 cards in four columns
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? System.lineSeparator() : "");
		}
	}

	
	
	public Card[] drawCard(int num) {
		Card[] drawnCards = new Card[num];
		
		for (int i = 0; i < num; i++) {
			Card drawnCard = list.remove(0);
			drawnCards[i] = drawnCard;
		}
		return drawnCards;
	}
	
	
	//Searching for files change image names to match card objects
	
	
//	public static void main(String[] args) {
//		DeckOfCards cards = new DeckOfCards();
//		cards.printcards();
//	}
}
