import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
	public static void main(String[] args) {
		
		ArrayList<Card> cards = new ArrayList<>();
		File dir = new File("src/assets/Uno Game Assets/");
		
		// for each file in the directory, create an array of segments with a split at the _
		for (File file : dir.listFiles()) {
			String[] segments = file.getName().replace(".png", "").split("_");
			
			int convertedValue = convertToInt(segments[1]);
			
			if (convertedValue != -1) {
					if(convertedValue == 0) {
						Card card = new Card(segments[0], String.valueOf(convertedValue), false);
						cards.add(card);
						System.out.println(card.cardName());
						
					}
					else {
						for (int j=0; j<2; j++) {
							Card card = new Card(segments[0], String.valueOf(convertedValue), false);
							cards.add(card);
							System.out.println(card.cardName());
						}
						
					}
				}
		}
		
	}
	
private static int convertToInt(String value) {
	switch(value) {
		case "Zero":
			return 0;
		case "One":
			return 1;
		case "Two":
			return 2;
		case "Three":
			return 3;
		case "Four":
			return 4;
		case "Five":
			return 5;
		case "Six":
			return 6;
		case "Seven":
			return 7;
		case "Eight":
			return 8;
		case "Nine":
			return 9;
		default:
			return -1;
	}
}
	
}
