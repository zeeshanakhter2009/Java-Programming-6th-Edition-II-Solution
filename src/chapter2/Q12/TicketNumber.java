/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.Q12;

import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class TicketNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ticketNum, rem11, rem22, temp;
        System.out.println("Plz Eneter ticket number with six digit only :: ");
        ticketNum = input.nextInt();
        rem11 = ticketNum % 10;
        temp = ticketNum / 10;
        rem22 = temp % 7;
        if (rem11 == rem22) {
            System.out.println(ticketNum + ": the comparison should evaluate to true");
        } else {
            System.out.println(ticketNum + ": the comparison should evaluate to false");
        }
    }
}
