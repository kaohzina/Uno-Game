
public class Deck{
	
	public static void main(String[] args) {
		
		setDeck();
		
	
	}

	private static Cards[] cards;
	private static int cardsInDeck = 0;
	
	public Deck() {
		
		cards = new Cards[108];
			
		}
	
	public static void setDeck() {
		Cards.Colors[] colors = Cards.Colors.values();
		
		for (int i = 0; i < colors.length - 1; i++) {
			Cards.Colors color = colors[i];
			
			cards[cardsInDeck++] = new Cards(color, Cards.Values.getValue(0));
			
			for (int j = 1; j < 10; j++) {
				cards[cardsInDeck++] = new Cards(color, Cards.Values.getValue(j));
				cards[cardsInDeck++] = new Cards(color, Cards.Values.getValue(j));
			}
			
			Cards.Values[] value = new Cards.Values[] {Cards.Values.DrawTwo, Cards.Values.Skip, Cards.Values.Reverse};
			
			for (Cards.Values values : value) {
				
				cards[cardsInDeck++] = new Cards(color, values);
				cards[cardsInDeck++] = new Cards(color, values);
			}

			Cards.Values[] wildValue = new Cards.Values[] {Cards.Values.Wild, Cards.Values.WildFour};
			for (Cards.Values values : wildValue) {
				for (int k = 0; k < 4; k++) {
					cards[cardsInDeck++] = new Cards(Cards.Colors.Wild, values);
				}
			}
		}
		
	}
	
	
}

