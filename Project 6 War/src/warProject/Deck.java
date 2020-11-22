package warProject;

import java.util.ArrayList;
 
import java.util.Collections;
import java.util.List;

public class Deck {
	
	 
	 List<Card>cards = new ArrayList<Card>();
 	
	 String[] suits  =  {"Spade", "Diamond","Club","Heart"};
 	
 	int[] rankOfCards = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

 
	 //constructor to initialize a new deck of cards
      public Deck() { 
       
    	  for ( int i = 0; i <= 3; i++) {
    		  for (int j = 0; j <= 12; j++) {
    			  //We know that Card contains int value and String value
    			  //we'll create a new Card object and assign values extracted from suits and rankOfCards
    			  //arrays into the new Card object we've created
    			  //Once that's done, we'll add the card object to the list of Card i.e. into the cards that we've defined
    			  
    			  Card newCard = new Card(rankOfCards[j], suits[i]); //creating a new card from the two arrays and assigning
    			  cards.add(newCard);  // back to the newCard 
        	   
    		  }
    	  }
      }
         
           //implement the shuffle method
          public void shuffle() {
        	  Collections.shuffle(cards);
          }
          
          //implement draw method
          public Card draw() {
        	return  cards.remove(0);
        	  
          }
          
      } 


