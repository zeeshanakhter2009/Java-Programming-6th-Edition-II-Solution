/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3.GameZone;

/**
 *
 * @author ZA
 */
public class Card {

    /**
     * @param suit field of Card object
     */
    private String suit;

    /**
     * @param number field of Card object
     */
    private String number;

    /**
     * Default constructor for the Card class
     */
    public Card() {
        suit = "Spades";
        number = "Jack";
    }

    /**
     * Method returns the Card objects number field value
     *
     * @return
     */
    public String getCardNum() {
        return number;
    }

    /**
     * Returns the Card objects suit field value
     *
     * @return
     */
    public String getCardSuit() {
        return suit;
    }

    /**
     * Sets the Card objects number field value based on the supplied parameter
     *
     * @param number
     */
    public void setCardNum(String number) {
        this.number = number;
    }

    /**
     * Sets the Card objects suit field value based on the supplied parameter
     *
     * @param number
     */
    public void setCardSuit(String suit) {
        this.suit = suit;
    }
}
