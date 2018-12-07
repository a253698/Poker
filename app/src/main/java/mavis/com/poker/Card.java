package mavis.com.poker;

public class Card {
    char[] flower = {'a', 'b', 'c', 'd'};
    int number;

    public Card(int number) {
        this.number = number;
    }

    public String get() {
        return (number % 13 + 1 + " " + flower[number / 13]);
    }

}

