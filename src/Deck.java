//import java.io.File;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Deck {
//	
//	public static void main(String[] args) {
//
//	}
//
//	private static Cards[] cards;
//	private static int cardsInDeck = 0;
//
//	public Deck() {
//		cards = new Cards[108];
//	}
//	
//	public static void setDeck() {
//	Cards.Colors[] colors = Cards.Colors.values();
//		
//		for (int i = 0; i < colors.length - 1; i++) {
//			Cards.Colors color = colors[i];
//			
//			cards[cardsInDeck++] = new Cards(color, Cards.Values.getValue(0));
//			
//			for (int j = 1; j < 10; j++) {
//				cards[cardsInDeck++] = new Cards(color, Cards.Values.getValue(j));
//				cards[cardsInDeck++] = new Cards(color, Cards.Values.getValue(j));
//			}
//			
//			Cards.Values[] value = new Cards.Values[] {Cards.Values.DrawTwo, Cards.Values.Skip, Cards.Values.Reverse};
//			for (Cards.Values values : value) {
//				cards[cardsInDeck++] = new Cards(color, values);
//				cards[cardsInDeck++] = new Cards(color, values);
//			}
//			Cards.Values[] wildValue = new Cards.Values[] {Cards.Values.Wild, Cards.Values.WildFour};
//			for (Cards.Values values : wildValue) {
//				for (int k = 0; k < 4; k++) {
//					cards[cardsInDeck++] = new Cards(Cards.Colors.Wild, values);
//				}
//			}
//		}
//	}
//
//
//
//	private int convertToInt(String value) {
//		switch(value) {
//			case "Zero":
//				return 0;
//			case "One":
//				return 1;
//			case "Two":
//				return 2;
//			case "Three":
//				return 3;
//			case "Four":
//				return 4;
//			case "Five":
//				return 5;
//			case "Six":
//				return 6;
//			case "Seven":
//				return 7;
//			case "Eight":
//				return 8;
//			case "Nine":
//				return 9;
//			default:
//				return -1;
//		}
//	};
//
//}
