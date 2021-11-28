
public class Card {
	String color;
	String value;
	boolean isWild;
	static String assetLocation;
	//background 
	
	//background in constructor created automatically
	public Card(String color, String value, boolean isWild) {
		this.color = color;
		this.value = value;
		this.assetLocation = "src/assets/Uno Game Assets/" + color + "_" + value;
		
		if (valueToInt(value)) {
			this.value = value;
		}
	}

	//background getter 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	private boolean valueToInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static String getAssetLocation() {
		return assetLocation;
	}


	public void setAssetLocation(String assetLocation) {
		this.assetLocation = assetLocation;
	}


	public String cardName() {
		return color + value;
	}
}
