

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

