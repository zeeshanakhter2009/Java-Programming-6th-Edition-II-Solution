/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.Q8;

import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class Fees {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int creditHours,booksAmount,totalFees;
        int athleticFee=65,payPerCreditHour=85;
        System.out.println("Eneter the number of credit hours :: ");
        creditHours=input.nextInt();
        System.out.println("Eneter amount of money spent on books :: ");
        booksAmount=input.nextInt();
        totalFees=creditHours*payPerCreditHour+booksAmount+athleticFee;
        System.out.println("**************************************");
        System.out.println("The Student Total Fees :: $"+totalFees);
        System.out.println("**************************************");
    }
}
