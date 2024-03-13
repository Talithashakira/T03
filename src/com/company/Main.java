package com.company;

public class Main {
    public static void main(String[] args) {

        Rectangle size1 = new Rectangle(8,10);
        Rectangle size2 = new Rectangle(10);

        System.out.println("Luas = " + size1.getArea());
        System.out.println("Luas = " + size2.getArea());

    }
}
