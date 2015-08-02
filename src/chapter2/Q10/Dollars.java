/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.Q10;

import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class Dollars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollarCurrency, ten, twenties, fives, ones;
        ten = twenties = fives = ones = 0;
        System.out.println("Eneter number of Dollar Currency :: $");
        dollarCurrency = input.nextInt();
        if (dollarCurrency >= 20) {
            twenties = dollarCurrency / 20;
            dollarCurrency = dollarCurrency - twenties * 20;
        }

        if (dollarCurrency >= 10) {
            ten = dollarCurrency / 10;
            dollarCurrency = dollarCurrency - ten * 10;
        }

        if (dollarCurrency >= 5) {
            fives = dollarCurrency / 5;
            dollarCurrency = dollarCurrency - fives * 5;
        }

        if (dollarCurrency < 5 && dollarCurrency > 0) {
            ones = dollarCurrency;
        }
         
        System.out.println("**************************************");
        System.out.println("Number of 20's are " + twenties);
        System.out.println("Number of 10's are " + ten);
        System.out.println("Number of 5's are " + fives);
        System.out.println("Number of 1's are " + ones);
        System.out.println("**************************************");
    }
}
