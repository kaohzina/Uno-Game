

public class Cards {
   public enum Value {One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse}            
   public enum Color {Red, Blue, Green, Yellow} 

   private final Value value; 
   private final Color color; 

   public Cards(Value value, Color color) {
   this.value = value; 
   this.color = color; 
   } 
   
   public Value getValue() {return value;}
   public Color getColor() {return color;}
   
   public String toString() {
      return String.format("%s %s", value, color);
   } 
} 