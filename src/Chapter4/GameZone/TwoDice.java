/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4.GameZone;

/**
 *
 * @author ZA
 */
public class TwoDice extends Die {

    public static void main(String[] args) {

          //creating an object to class Die
        Die roller = new Die();

          //obtaining values for each die
        int playerRoll1 = roller.getValue();

        int playerRoll2 = roller.getValue();

        int playerRoll3 = roller.getValue();

        int playerRoll4 = roller.getValue();

        //Display values for player1 and player2
        System.out.println(" Results ");

        System.out.println(" Player1:");

        System.out.println("Die 1 rolled a " + playerRoll1);

        System.out.println("Die 2 rolled a " + playerRoll2);

        System.out.println(" Player2:");

        System.out.println("Die 1 rolled a " + playerRoll3);

        System.out.println("Die 2 rolled a " + playerRoll4);

    }

}
