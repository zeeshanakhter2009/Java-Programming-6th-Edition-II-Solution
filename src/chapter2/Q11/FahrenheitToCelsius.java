/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.Q11;

import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f,c;
        System.out.println("Eneter temperature in Fahrenheit :: $");
        f = input.nextDouble(); 
        
        c=(f-32)*(5/9.0);
        
        System.out.println("**************************************");
        System.out.println(f + " Fahrenheit = "+c+ " Celsius");
        System.out.println("**************************************");
    
    }
}
