package Programmings;

import java.util.Vector;

public class Enumeration {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("element1");
        vector.add("element2");
        vector.add("element3");

        java.util.Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}