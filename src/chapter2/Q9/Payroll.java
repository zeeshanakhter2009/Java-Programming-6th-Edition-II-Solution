/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.Q9;

import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class Payroll {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grossPay, hourlyRate, numOfHours;
        double netPay;
        System.out.println("Eneter hourly rate :: ");
        hourlyRate = input.nextInt();
        System.out.println("Eneter number of hours worked :: ");
        numOfHours = input.nextInt();
        grossPay = hourlyRate * numOfHours;
        netPay = grossPay - (grossPay * 0.15);
        System.out.println("**************************************");
        System.out.println("Gross Pay :: $" + grossPay);
        System.out.println("Net Pay :: $" + netPay);
        System.out.println("**************************************");
    }
}
