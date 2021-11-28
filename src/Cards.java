
<<<<<<< HEAD
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
=======

public class Cards {
	public static void main(String[] args) {
		
		
		
		System.out.print(Colors.colors[0]);
		System.out.print(Values.values[0]);
		
		
	
	}
	
public enum Colors { Red, Blue, Green, Yellow, Wild;
		
		private static Colors[] colors = Colors.values();
		 public static Colors getcolor(int i) {
			 return Colors.colors[i];
		 }
	
		
	}
	
	
	public enum Values { Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse, Wild, WildFour;
		
		private static Values[] values = Values.values();
		 public static Values getValue(int i) {
			 return Values.values[i];
		 }
	
	
	private Colors color;
	private Values value;
	
	
	public void Cards(Colors color, Values value) {
	
		this.color = color;
		this.value = value;
	}
	
	
	/**
	 * @return the color
	 */
	public Colors getColor() {
		return color;
	}


	/**
	 * @return the value
	 */
	public Values getValue() {
		return value;
	}
	}
	
}

>>>>>>> a4939c0d1da51b01e299a216edc29303c86da6c1
