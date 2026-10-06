package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * @author dancye
 * @author Kikonde Mwondha Oct 5, 2026
 */
public class CardTrick {

    public static void main(String[] args) {

        Random random = new Random();
        Card[] hand = new Card[7];

        // Builds User Hand
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);

            card.setSuit(Card.SUITS[random.nextInt(Card.SUITS.length)]);

            hand[i] = card;

        } // End of For Loop

        // Ask User To Pick a Card
        Scanner in = new Scanner(System.in);

        System.out.print("Pick a card value (1-13):  ");
        int userValue = in.nextInt();

        System.out.print("Pick a suit (1-Hearts, 2-Diamonds, 3-Spades, 4-Clubs):  ");
        int userSuit = in.nextInt();

        // Create User Card
        Card userCard = new Card();

        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]);

        // Search
        boolean found = false;
        for (int i = 0; i < hand.length; i++) {
            System.out.println(
                    hand[i].getValue() + " of " + hand[i].getSuit());
            if (userCard.getValue() == hand[i].getValue()
                    && userCard.getSuit().equals(hand[i].getSuit())) {

                found = true;
                break;
            }
        }
        System.out.println("-".repeat(80));
        if (found) {
            printInfo();
            
        }
        System.out.println("Card not found.");
    }

    // I'm done!
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Kikonde (key-kon-day), but you can call me Kiko (key-ko)");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Become a senior engineer or C-level executive (i.e Chief Technology Officer");
        System.out.println("-- Eventually pivot into founding a SaaS company based off problems I encounter in life.");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Chess");
        System.out.println("-- Mixed Martial Arts");
        System.out.println("-- Reading non-fiction: psychology, history");
        System.out.println("-- Indoor and Outdoor workouts.");

        System.out.println();

    }

}
