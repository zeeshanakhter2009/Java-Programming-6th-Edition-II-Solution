/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3.Q11;

import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class TestCheckup_b {

    public static void main(String[] args) {
        Checkup_a checkup1;
        Checkup_a checkup2;
        Checkup_a checkup3;
        Checkup_a checkup4;
        
        checkup1=getData();
        checkup2=getData();
        checkup3=getData();
        checkup4=getData();
        
        showData(checkup1);
        showData(checkup2);
        showData(checkup3);
        showData(checkup4);

    }

    public static Checkup_a getData() {
        int patientNo;
        int systolicBP;
        int diastolicBP;
        int cholesterolLDL;
        int cholesterolHDL;
        Checkup_a checkup_a = new Checkup_a();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter patient number: ");
        patientNo = input.nextInt();
        System.out.println("Enter systolic BP: ");
        systolicBP = input.nextInt();
        System.out.println("Enter diastolic BP: ");
        diastolicBP = input.nextInt();
        System.out.println("Enter cholesterol LDL: ");
        cholesterolLDL = input.nextInt();
        System.out.println("Enter cholesterol HDL: ");
        cholesterolHDL = input.nextInt();
        System.out.println();
        checkup_a.setPatientNo(patientNo);
        checkup_a.setSystolicBP(systolicBP);
        checkup_a.setDiastolicBP(diastolicBP);
        checkup_a.setCholesterolLDL(cholesterolLDL);
        checkup_a.setCholesterolHDL(cholesterolHDL);
        return checkup_a;
    }

    public static void showData(Checkup_a checkup) {
        System.out.println("Patient Number : " + checkup.getPatientNo());
        System.out.println("Typical BP values : " + checkup.getSystolicBP() + "/" + checkup.getDiastolicBP());
        System.out.println("Typical Cholesterol values : " + checkup.getCholesterolLDL() + " and " + checkup.getCholesterolHDL());
        checkup.computeRatio();
        checkup.explainRatio();
    }
}
