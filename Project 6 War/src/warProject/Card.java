package warProject;

public class Card {
	
	private int value;
	private String suit;
	
	public Card (int value, String suit) {
		this.suit = suit;
		this.value = value; //constructor
	}
	 
	public void describe() { // describe method
		System.out.println(this.suit);
		System.out.println(this.value); 
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}

}
