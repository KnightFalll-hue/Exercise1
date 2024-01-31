package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 *@author Michael Milivojevich 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random rand=new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
            int suitNum = rand.nextInt(0,3);
            int value = rand.nextInt(1,13);
            
            
            hand[i] = new Card(Card.SUITS[suitNum],value);
            System.out.println(hand[i].getSuit() + " " + hand[i].getValue());
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Guess a card, any card!");
        
        System.out.println("Please enter a Suit");
        String userSuit = myObj.nextLine();
        
        System.out.println("Please enter a number 1-13");
        int userNum = myObj.nextInt();
        
        for (int i = 0; i<7; i++){
            //hand[i].getSuit() + " " + hand[i].getValue()
            if (hand[i].getSuit().equalsIgnoreCase(userSuit) && hand[i].getValue() == userNum){
                printInfo();
            }
            
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Michael");
        System.out.println();
        
        System.out.println("My school ambitions:");
        System.out.println("-- Pass a full courses load");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Watching anime");
        System.out.println("-- Playing Video Games");
        System.out.println("-- Playing Dnd");

        System.out.println();
        
    
    }

}
