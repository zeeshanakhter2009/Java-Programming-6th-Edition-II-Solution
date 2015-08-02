/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.Q10;

/**
 *
 * @author ZA
 */
public class Diamond {

    public static void main(String[] args) {
        System.out.println("  *");
        System.out.println(" * *");
        System.out.println("* * *");
        System.out.println(" * *");
        System.out.println("  *");
        
        
        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < 9 - i / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (int i = 7; i > 0; i -= 2) {
            for (int j = 0; j < 9 - i / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

}
