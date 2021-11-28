
public class Cards {
	//change to number and color

   public enum Value {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse, Wild, WildFour }            
   public enum Color {Red, Blue, Green, Yellow, Wild} 

   private final Value value; 
   private final Color color; 
   
   // constructor
   //change to number and color
   public Cards(Value value, Color color) {
       this.value = value; 
       this.color = color; 
   } 
   
   // return Value of the card
   public Value getValue() {return value;}

   // return Color of Card
   public Color getColor() {return color;}

   // return String representation of Card
   public String toString() {
      return String.format("%s %s", value, color);
   } 
} 