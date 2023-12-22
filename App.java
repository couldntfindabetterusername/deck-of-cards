
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void distributeCards(Deck deck, Queue<Player> playersQueue) {
        for (int card = 0; card < 9; card++) {
            for (Player player : playersQueue) {
                Card c = deck.getRandomCard();
                player.cards.add(c);
            }
        }
    }

    public static void displayCards(Queue<Player> playersQueue) {
        while (!playersQueue.isEmpty()) {
            Player currentPlayer = playersQueue.poll();
            currentPlayer.displayCards();
        }
    }

    public static void main(String[] args) {

        Deck deck = new Deck();

        Queue<Player> playersQueue = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            playersQueue.add(new Player("Player " + (i + 1)));
        }

        distributeCards(deck, playersQueue);

        for (Player player : playersQueue) {
            player.sortCardsByRank();
        }

        displayCards(playersQueue);

    }
}
