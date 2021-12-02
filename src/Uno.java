

// Start rules for the game mechanics
// Use deck of cards to draw from the deck

// Create a player 



// Draw 2 rule make next player draw two new cards.



// Skip Turn Rule; change the order of the turns


// Reverse Turn Rule; reverse the order of playing


// Draw 4 Rule the player the rule applies to must draw four cards


// Draw Card Rule; make it so that the player draws a card and turn goes to next person


// Uno call rule, call the draw four rule


class Uno {
	Uno(){
		this.roundNumber = 0;
		this.isPlayerTurn = false;
		this.enemies = [];
		this.currentPlayer;
		this.player;
	}
	
	void initializeGame() {
		this.currentPlayer = this.player[0];
	}
}





