/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 22-Aug-20
 *  Time: 1:31 PM
 */

/*
1.	Write a class whose instances represent a
	single playing card from a deck of cards.
	Playing cards have two distinguishing
	properties: rank and suit.


 */

package handson1;

public class PlayingCard {
    //instance variable
    private int rank;
    private String suit;

    //constructors
    public PlayingCard() {
        rank = 0;
        suit = null;
    }

    public PlayingCard(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    //getter and setter


    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
