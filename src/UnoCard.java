
public class UnoCard {//creating uno cards
	
	//vars should not change or be accessed by other classes
	private final Color color;
	private final Special special;
	private final Number number;
	
	//constructor
	public UnoCard(Color color, Special special, Number number) {
		this.color = color;
		this.special = special;
		this.number = number;
	}
	red
	
	//could do String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "Draw2", "WildDraw4", Wild"}
	//String colors = {"Red", "Blue", "Green", "Yellow", "Wild"}
	
	
	enum Color 
	{
		Red, Blue, Green, Yellow, Wild;//defining what colors we want
		private static final Color [] color = Color.values();// setting array to contain all color values that were stated from above
		public static Color getColor(int c) 
		{
			return Color.color[c];
		}
	}
	
	enum Special//Should Special be part of the Number enum?
	{
		Skip, Reverse, WildDrawFour, Wild, drawTwo;//defining what specials we want
		private static final Special [] special = Special.values();//setting array to contain all color values that were stated from above
		public static Special getSpecial(int s)
		{
			return Special.special[s];
		}
	}
	
	enum Number
	{
		zero, one, two, three, four, five, six, seven, eight, nine;//defining what numbers we want
		private static final Number [] number = Number.values();//setting array to contain all Numbers 0-9 values that were stated from above
		public static Number getNumber(int n)
		{
			return Number.number[n];
		}
	}

	
	//generate get/set methods for attributes
	public Color getColor() 
	{
		return this.color;
	}
	
	public Special getSpecial() 
	{
		return this.special;
	}

	public Number getNumber() 
	{
		return this.number;
	}

//print out results
	@Override
	public String toString() {
		return String.format("%s" + "_" + "%s", color, number);//print layout for the console output.
	}
	
	
	
	

}
