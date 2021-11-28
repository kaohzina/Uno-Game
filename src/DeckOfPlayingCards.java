// Fig. 16.10: DeckOfCardss.java
// Cards shuffling and dealing with Collections method shuffle.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// class to represent a Cards in a deck of Cardss
	//Removed to Cards.java

// class DeckOfCardss declaration
public class DeckOfPlayingCards {
   private List<Cards> list; // declare List that will store Cardss

   // set up deck of Cardss and shuffle
   public DeckOfPlayingCards() {
	   Cards[] deck = new Cards[108];
      int count = 0; // number of Cardss

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
      // display 52 Cardss in four columns
      for (int i = 0; i < list.size(); i++) {
         System.out.printf("%-19s%s", list.get(i),
            ((i + 1) % 4 == 0) ? System.lineSeparator() : "");
      } 
   } 

   
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
