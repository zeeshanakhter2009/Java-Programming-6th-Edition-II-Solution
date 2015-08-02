/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.Q11;

/**
 *
 * @author ZA
 */
public class Comments {

    public static void main(String[] args) {
        String des = "Program Comments are nonexecuting statements you add to a file for the purpose of documentation.";
        displayLineComments(des);
        displayBlockComments(des);
    }

    public static void displayLineComments(String arg) {
        System.out.println("Line Comments :: ");
        System.out.println("A line comment Starts with two forward slashes ( // ) and ends with no symbol.");
        System.out.println("For example , aline commentted looks like ...");
        System.out.println("// " + arg);
        System.out.println();
    }

    public static void displayBlockComments(String arg) {
        System.out.println("Block Comments :: ");
        System.out.println("A block comment Starts with a forward slashe and an asterisk ( /* ) "
                + "and ends with an asterisk and forward slash ( */ ).");
        System.out.println("For example , a block commentted looks like ...");
        System.out.println("/* " + arg + " */");
        System.out.println();
    }
}
