package com.company;

public class Main {

    public static void main(String[] args) {

        double x = 20.00;
        double y = 80.00;

        double total = (x + y) * 100;
        System.out.println("Total value is " + total);

        double remainder = total % 40.00;
        System.out.println("The remainder value is " + remainder);

        boolean isZero = (remainder == 0) ? true : false;

        if (isZero) {
            System.out.println("The remainder is zero");
        }
    }
}
