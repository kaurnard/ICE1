/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Nardeep Kaur 991556048
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        for (int i=0; i<magicHand.length; i++)
        {
//            Card c = new Card();
             int value = rand.nextInt(13) + 1; // Generates values between 1 and 13
            int suitIndex = rand.nextInt(Card.SUITS.length); // Generates index between 0 and 3
            magicHand[i] = new Card();
            magicHand[i].setValue(value);
            magicHand[i].setSuit(Card.SUITS[suitIndex]);
            System.out.println(SUITS[suitIndex] + " " + value);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        Scanner scanner = new Scanner(System.in);
        
        // Asking the user for card number and suit
        System.out.println("Enter a card number (1-13):");
        int userNumber = scanner.nextInt();
        System.out.println("Enter a suit: Hearts, Diamonds, Clubs, Spades");
        scanner.nextLine(); // Consume the leftover newline
        String userSuit = scanner.nextLine();
        
        // Create user card
        Card userCard = new Card();
        userCard.setValue(userNumber);
        userCard.setSuit(userSuit);
        
        // Search for user card in magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
 
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");

            
        }
        
    }
    
}

