package warProject;

 

public class App {

	public static void main(String[] args) {
		 
		Deck deck = new Deck();
		deck.shuffle();
		
	 	Player p1 = new Player();
	 	p1.setName("Sam");
	 	
	 	Player p2 = new Player();
		p2.setName("Tom");


		for(int i = 0; i<52; i++) {
		 
			if (i % 2 == 0) {
				p1.draw(deck);
				
			}else{
				
				p2.draw(deck);
			}
		}
			
		for( int i = 0; i < 26; i++) {
			
			int playerOneCard = p1.flip().getValue();
			int playerTwoCard = p2.flip().getValue();
			
			if (playerOneCard > playerTwoCard){
				p1.incrementScore(); 
			}else if (playerOneCard < playerTwoCard){
				p2.incrementScore();
			} else {
				//do nothing
			}
			 
				 
		}
		
		if (p1.getScore() > p2.getScore()) {
			 System.out.println("Sam won!");
		 }else {
			System.out.println("Tom won!");
			 
		 }
	}	
		
}
	
