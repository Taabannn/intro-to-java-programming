package ch_02;
/*
2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area.
*/

import java.util.Scanner;


public class Ex0216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal for the length of the side of a hexagon: ");
        double side = input.nextDouble();

        double operand = (3 * Math.pow(3, 0.5)) / 2;
        double res = operand * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + res);

    }
}
