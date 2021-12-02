//
//
//public class Card {
//	
//	
//	/** Look at how Cards are implimented through this website:
//	 * https://www.infoworld.com/article/2077217/card-engine-in-java.html
//	 * Uses the IMPLEMENTS and INTERFACE methods
//	 */
//	
////	   public enum Value {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse, Wild, WildFour }            
////	   public enum Color {Red, Blue, Green, Yellow, Wild} 	
//	
////	   private final Value value; 
////	   private final Color color; 
//	
//	
//	
//	/**
//	 * STRING HERE? SHOULDN'T THIS BE AN ENUM?!
//	 */
//	String color;
//	String value;
//	boolean isWild;
//	static String assetLocation;
//	//background 
//	
//	//background in constructor created automatically
//	public Card(String color, String value, boolean isWild) {
//		this.color = color;
//		this.value = value;
//		this.assetLocation = "src/assets/Uno Game Assets/" + color + "_" + value;
//		
//		if (valueToInt(value)) {
//			this.value = value;
//		}
//	}
//
//	//background getter 
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {//why is this a sting?
//		this.color = color;
//	}
//	public String getValue() {
//		return value;
//	}
//	public void setValue(String value) {//what is this a string?
//		this.value = value;
//	}
//	
//	
//	private boolean valueToInt(String value) {
//		try {
//			Integer.parseInt(value);
//			return true;
//		}
//		catch (Exception e) {
//			return false;
//		}
//	}
//	
//	public static String getAssetLocation() {
//		return assetLocation;
//	}
//
//
//	public void setAssetLocation(String assetLocation) {
//		this.assetLocation = assetLocation;
//	}
//
//
//	public String cardName() {
//		return color + value;
//	}
//	
//	
//}
