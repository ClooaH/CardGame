public class Game {
    public static void main(String[] args) {
        Card aceOfSpades = new Card(Card.Suits.SPADE, 1);
        Card twoOfHearts = new Card(Card.Suits.HEART, 2);
        System.out.println(aceOfSpades + ", " + twoOfHearts);
        if (aceOfSpades.compareTo(twoOfHearts) > 0) {
            System.out.println("Ace of spades beats two of hearts");
        }
    }
}
