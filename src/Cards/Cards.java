package Cards;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
//Total number of cards equal 108
// 4 	zeroes
// 18 	(1-9) Red
// 18 	(1-9) Blue
// 18 	(1-9) Green
// 18 	(1-9) Yellow
// 4	2 of each colored draw two
// 4	2 of each colored skip
// 4	2 of each colored reverse
// 4	neutral wild cards
// 4 	draw four wild cards

class Cards {
	public enum Value {
		One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse
	}
	public enum Color {
		Red, Blue, Green, Yellow
	}
	
	private final Value value;
	private final Color color;
	
	public Cards(Color color, Value value) {
		this.value = value;
		this.color = color;
	}

	public Value getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}

	public String toString() {
		return String.format("%s %s", color, value);
	}
}

//class Zero {
//	public enum Zeroes {
//		Zero
//	}
//	public enum Color {
//		Red, Blue, Green, Yellow
//	}
//	
//	private final Zeroes zero;
//	private final Color color;
//	
//	public Zero(Color color, Zeroes zero) {
//		this.color = color;
//		this.zero = zero;
//	}
//	
//	public Zeroes getZero() {
//		return zero;
//	}
//	public Color getColor() {
//		return color;
//	}
//	
//	public String toString() {
//		return String.format("%s %s", color, zero);
//	}
//	
//}


class DeckOfCards {
	private List<Cards> list;
//	private List<Zero> zlist;
	public DeckOfCards() {
		Cards[] deck = new Cards[96];
		int deckCount = 0;
//		Zero[] zDeck = new Zero[4];
//		int zdeckCount = 0;
//		
//		for (Zero.Zeroes zero : Zero.Zeroes.values()) {
//			for (Zero.Color color : Zero.Color.values()) {
//				zDeck[zdeckCount] = new Zero(color, zero);
//				++zdeckCount;
//			}
//		}
		
		for (Cards.Value value : Cards.Value.values()) {
			for (Cards.Color color : Cards.Color.values()) {
				deck[deckCount] = new Cards(color, value);
				++deckCount;
			}
		}
		for (Cards.Value value : Cards.Value.values()) {
			for (Cards.Color color : Cards.Color.values()) {
				deck[deckCount] = new Cards(color, value);
				++deckCount;
			}
		}
		
		list = Arrays.asList(deck);
		Collections.shuffle(list);

//		zlist = Arrays.asList(zDeck);
//		Collections.shuffle(zlist);
	}

	public void setDeck() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? System.lineSeparator() : "");
		}
	}

	public static void main(String[] args) {
		DeckOfCards cards = new DeckOfCards();
		cards.setDeck();
	}

}
