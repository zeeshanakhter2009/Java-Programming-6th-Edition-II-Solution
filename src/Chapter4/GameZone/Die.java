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
public class Die {
    //static variable declaration

    public static final int LOWEST_DIE_VALUE = 1;

    public static final int HIGHEST_DIE_VALUE = 6;

     //method to generate random Value and return them
    public int getValue() {

        int randomValue = ((int) (Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);

        return randomValue;

    }
}
