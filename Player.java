import java.util.LinkedList;

public class Player {
    String name;
    LinkedList<Card> cards = new LinkedList<>();

    public Player(String name) {
        this.name = name;
    }

    public void sortCardsByRank() {
        for (int i = 0; i < cards.size() - 1; i++) {
            for (int j = 0; j < cards.size() - 1 - i; j++) {
                if (getRankValue(cards.get(j).rank) > getRankValue(cards.get(j + 1).rank)) {
                    Card temp = cards.get(j);
                    cards.set(j, cards.get(j + 1));
                    cards.set(j + 1, temp);
                }
            }
        }
    }

    private int getRankValue(String rank) {
        switch (rank) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "Jack":
                return 11;
            case "Queen":
                return 12;
            case "King":
                return 13;
            case "Ace":
                return 14;
            default:
                return 0;
        }
    }

    public void displayCards() {
        System.out.println("Player: " + name);
        System.out.println("Cards:");
        for (Card card : cards) {
            System.out.println(card.rank + " of " + card.suit);
        }
        System.out.println();
    }
}
