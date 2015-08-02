/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3.GameZone;

import javax.swing.JOptionPane;

/**
 *
 * @author ZA
 */
public class PickTwoCards {

    /**
     * first Card object (CardOne)
     */
    private Card CardOne;

    /**
     * second Card object (CardTwo)
     */
    private Card CardTwo;

    /**
     * the value of the suit field for the first Card object (CardOne)
     */
    private String suitOne;

    /**
     * the value of the suit field for the first Card object (CardTwo)
     */
    private String suitTwo;

    /**
     * the value of the number field for the first Card object (CardOne)
     */
    private String numberOne;

    /**
     * the value of the number field for the first Card object (CardTwo)
     */
    private String numberTwo;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        PickTwoCards RandomCards = new PickTwoCards(); //reverse order of next 2 methods will trigger null pointer
        RandomCards.genTwoCards();
        RandomCards.displayCards();
    }

    /**
     * Sole constructor for the PickTwoCards class
     */
    public PickTwoCards() {
        numberOne = "One";
        suitOne = "Spades";
        numberTwo = "Two";
        suitTwo = "Diamonds";
    }

    /**
     * Instantiates 2 card objects (Card1 and Card2). Generates a random number
     * and random suit for both Card1 and Card2 and send those values to the
     * setter methods in the Card class
     */
    public void genTwoCards() {
        CardOne = new Card();
        CardTwo = new Card();

        // generates random int and converts to type String (suit)
        String[] suitArray = new String[]{"Clubs", "Hearts", "Spades", "Diamonds"};
        int s1 = (int) (Math.random() * suitArray.length);
        int s2 = (int) (Math.random() * suitArray.length);
        suitOne = suitArray[s1];
        suitTwo = suitArray[s2];
        CardOne.setCardSuit(suitOne);
        CardTwo.setCardSuit(suitTwo);

        // generates random int and converts to type String (number)
        String[] numArray = new String[]{"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        int r1 = (int) (Math.random() * numArray.length);
        int r2 = (int) (Math.random() * numArray.length);
        numberOne = numArray[r1];
        numberTwo = numArray[r2];
        CardOne.setCardNum(numberOne);
        CardTwo.setCardNum(numberTwo);
    }

    /**
     * Displays the random cards using the JOptionPane class
     */
    public void displayCards() {
        try {
            JOptionPane.showMessageDialog(null, "The first card is the " + CardOne.getCardNum() + " of " + CardOne.getCardSuit());
            JOptionPane.showMessageDialog(null, "The second card is the " + CardTwo.getCardNum() + " of " + CardTwo.getCardSuit());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Exception handling practice");
        }
    }
}
