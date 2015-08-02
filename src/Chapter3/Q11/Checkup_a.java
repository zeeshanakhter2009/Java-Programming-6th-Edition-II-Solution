/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3.Q11;

/**
 *
 * @author ZA
 */
public class Checkup_a {

    private int patientNo;
    private int systolicBP;
    private int diastolicBP;
    private int cholesterolLDL;
    private int cholesterolHDL;
    private double cholesterolRatio;

    public Checkup_a() {
    }

    public Checkup_a(int patientNo, int systolicBP, int diastolicBP, int cholesterolLDL, int cholesterolHDL, double cholesterolRatio) {
        this.patientNo = patientNo;
        this.systolicBP = systolicBP;
        this.diastolicBP = diastolicBP;
        this.cholesterolLDL = cholesterolLDL;
        this.cholesterolHDL = cholesterolHDL;
        this.cholesterolRatio = cholesterolRatio;
    }

    public int getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(int patientNo) {
        this.patientNo = patientNo;
    }

    public int getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(int systolicBP) {
        this.systolicBP = systolicBP;
    }

    public int getDiastolicBP() {
        return diastolicBP;
    }

    public void setDiastolicBP(int diastolicBP) {
        this.diastolicBP = diastolicBP;
    }

    public int getCholesterolLDL() {
        return cholesterolLDL;
    }

    public void setCholesterolLDL(int cholesterolLDL) {
        this.cholesterolLDL = cholesterolLDL;
    }

    public int getCholesterolHDL() {
        return cholesterolHDL;
    }

    public void setCholesterolHDL(int cholesterolHDL) {
        this.cholesterolHDL = cholesterolHDL;
    }

    public double getCholesterolRatio() {
        return cholesterolRatio;
    }

    public void setCholesterolRatio(double cholesterolRatio) {
        this.cholesterolRatio = cholesterolRatio;
    }

    @Override
    public String toString() {
        return "Checkup{" + "patientNo=" + patientNo + ", systolicBP=" + systolicBP + ", diastolicBP=" + diastolicBP + ", cholesterolLDL=" + cholesterolLDL + ", cholesterolHDL=" + cholesterolHDL + ", cholesterolRatio=" + cholesterolRatio + '}';
    }

    public void computeRatio() {
        cholesterolRatio = ((double) cholesterolLDL) / cholesterolHDL;
        cholesterolRatio = Math.round(cholesterolRatio * 10.0) / 10.0;
        System.out.println("Cholesterol Ratio : " + cholesterolRatio);
    }

    public void explainRatio() {
        if (cholesterolRatio <= 3.5) {
         System.out.println(" ******** Good Cholesterol ********* ");
        } else {
         System.out.println("  You Should Decrease the Cholesterol \n");
        }
        System.out.println();
    }
}
