// Fig. 16.10: DeckOfCardss.java
// Cards shuffling and dealing with Collections method shuffle.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// class to represent a Cards in a deck of Cards
	//Removed to Cards.java

// class DeckOfCardss declaration
public class DeckOfPlayingCards {
   private List<Cards> list; // declare List that will store Cards

   // set up deck of Cards and shuffle
   public DeckOfPlayingCards() {
	   Cards[] deck = new Cards[108];
      int count = 0; // number of Cards

      // populate deck with Cards objects
      for (Cards.Color color : Cards.Color.values()) {
         for (Cards.Value value : Cards.Value.values()) {  
            deck[count] = new Cards(value, color);
            ++count;
         } 
      } 

      list = Arrays.asList(deck); // get List    
      Collections.shuffle(list);  // shuffle deck
   } 

   // output deck
   public void printCards() {
      // display 52 Cards in four columns
      for (int i = 0; i < list.size(); i++) {
         System.out.printf("%-19s%s", list.get(i),
            ((i + 1) % 4 == 0) ? System.lineSeparator() : "");
      } 
   } 

   
} 
