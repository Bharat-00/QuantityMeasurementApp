package org.example;
import java.util.Scanner;
public class QuantityMeasurementApp {
    // Inner class to represent Feet measurement
    public static class Feet {
        private final double value;
        // Constructor
        public Feet(double value) {
            this.value = value;
        }
        public double getValue() {
            return value;
        }
        // Overriding equals() method
        @Override
        public boolean equals(Object obj) {
            //Reference check
            if (this == obj) {
                return true;
            }
            //Null check
            if (obj == null) {
                return false;
            }
            //Type check
            if (getClass() != obj.getClass()) {
                return false;
            }
            //Cast and compare
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value in feet: ");
        double value1 = scanner.nextDouble();
        System.out.print("Enter second value in feet: ");
        double value2 = scanner.nextDouble();
        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);
        boolean result = feet1.equals(feet2);
        if (result) {
            System.out.println("Equal (true)");
        } else {
            System.out.println("Not Equal (false)");
        }
        scanner.close();
    }
}
