/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5.GameZone;

import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class RandomGuess2 {

    public static void main(String[] args) {

        int secretNumber;

        secretNumber = (int) (Math.random() * 999 + 1);

        System.out.println("Secret number is " + secretNumber); // to be removed later

        Scanner keyboard = new Scanner(System.in);

        int guess;

        System.out.print("Enter a guess: ");

        guess = keyboard.nextInt();

        System.out.println("Your guess is " + guess);

        if (guess == secretNumber) {
            System.out.println("Your guess is correct. Congratulations!");
        } else if (guess < secretNumber) {
            System.out
                    .println("Your guess is smaller than the secret number.");
        } else if (guess > secretNumber) {
            System.out
                    .println("Your guess is greater than the secret number.");
        }
    }
}
