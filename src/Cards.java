

public class Cards {
	public static void main(String[] args) {
		
		Colors[] colors = Colors.values(); {
		
		for (int i = 0; i < colors.length - 1; i++) {
			Colors color = colors[i];
	
			
		Values[] values = Values.values(); {
		
			for (int k = 0; k < 1; k++) {
				Values value = values[k];
				
				System.out.printf("%s %s, %n", color, value);
				
			}
			
			for (int j = 1; j < 10; j++) {
				Values value = values[j];
				
				System.out.printf("%s %s, %n", color, value);
				System.out.printf("%s %s, %n", color, value);
				
			}
			
			for (int s = 10; s < 13; s++) {
				Values special = values[s];
				
				System.out.printf("%s %s, %n", color, special);
				System.out.printf("%s %s, %n", color, special);
				
			}
			for (int s = 13; s < 15; s++) {
				Values special = values[s];
				
				System.out.printf("%s %s, %n", color, special);
				
				
			}
		}
			
		}
		}
		
		
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

