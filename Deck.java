import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    List<String> suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");
    List<String> ranks = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
    List<Card> deck = new ArrayList<Card>();

    Deck() {
        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
    }

    public Card getRandomCard() {
        Random random = new Random();
        int randomNumber = random.nextInt(deck.size());

        Card card = deck.get(randomNumber);
        deck.remove(randomNumber);

        return card;
    }
}
