package warProject;

import java.util.ArrayList;

 
public class Player {
	 	
	private ArrayList<Card> hand;                       // need 26 cards for each player
	private int score;                           //  what matches up here
	private String name;


	public int getScore() {
		return score;
	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Player() {
		score = 0;
		hand = new ArrayList<Card>();
		name = "";
	}
		
	public void describe() { 		// describe method
	 System.out.println(name);
	 System.out.println(score);	
	 for (Card card: hand) {
		card.describe(); 
	 }
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	 
	}
	
	public Card flip() {   //hand is a list of Card, contains Card elements
		return hand.remove(0);   
		 
		 
	}
	
	public void incrementScore() {
		 score++;
	}
    
  }
