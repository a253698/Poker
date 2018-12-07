package mavis.com.poker;

import java.util.Random;

public class Poker {
    Card[] cards = new Card[52];
    private int a;

    public Poker() {
        for (int n = 0; n < 52; n++) {
            cards[n] = new Card(n);
        }
    }

    public void shuffle() {
        for (int b = 1; b <= 52; b++) {
            int r = new Random().nextInt(52);
            Card temp = cards[b];
            cards[b] = cards[r];
            cards[r] = temp;
        }
    }
}
