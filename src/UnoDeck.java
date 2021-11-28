import java.util.Random;

public class UnoDeck {//populating deck of cards

	//have to imput UnoCards array somewhere
	private int cardsInUnoDeck;
	private UnoCard[] cards;
	
	
	public UnoDeck() {
	
<<<<<<< HEAD
=======

>>>>>>> 9caa93ac81413db935b127e661dd306f6815ceba
		
	}

	public void DeckOfCards() 
	{
//		UnoCard.Color[] colors = UnoCard.Color.values();//pulling values from line 18 of UnoCard.java
//		//there are 5 colors in UnoCard.Color.values()
//	int cardsInDeck = 0;
//	
//		//Initialize cards
//	for (int i = 0; i < colors.length-1; i++)//standard cycle through array 
//	{
//		colors[i] =i;//something not right
//	}
	
		cards = new UnoCard[108];
		
		
	}
	
	
	
	
	
	//shuffling the cards
	for (int i=0; i < cards.length; i++)
	{
		int index = (int)(Math.random() *cards.length);//make cards random order
		
	}
	
	
<<<<<<< HEAD
<<<<<<< HEAD
	//this is a test
=======
	
>>>>>>> 9caa93ac81413db935b127e661dd306f6815ceba
=======
	//this is a test
>>>>>>> a818dd81430f62a975f09f501a7e3ecb908c769a
	
	
//	//draw method
//	public static draw [] (int)
//	{
//		Random rand = new Random (108);//randomize draw/shuffle methods
//		Deck deck = new Deck(108);
//		
//	}
<<<<<<< HEAD
=======
	// something here
>>>>>>> 9caa93ac81413db935b127e661dd306f6815ceba
	
	
	//deck class
	
	
	
	//shuffle method
		//have random set of 108 cards
	
	//number of cards for each
	
	/*
	 * 
19 blue cards - 0 to 9;
19 red cards - 0 to 9;
19 yellow cards - 0 to 9;
19 green cards - 0 to 9;
8 “Draw Two” cards- two of each color;
8 “Skip” cards- two of each color;
8 “Reverse” cards- two of each color;
4 “Wild” cards;
4 “Wild Draw Four” cards
	 * 
	 */
	
<<<<<<< HEAD
	
	
}
=======

	//can you read this message?
}



// git add . or git add -A to add all of your changes to github
// 


>>>>>>> 9caa93ac81413db935b127e661dd306f6815ceba
