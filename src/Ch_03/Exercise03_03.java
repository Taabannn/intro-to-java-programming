package Ch_03;

import java.util.Scanner;

/*
 * *3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
Cramer�s rule given in Programming Exercise 1.13. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
that �The equation has no solution.�
 */

/**
 * 
 * @author Harry Dulaney IV
 *
 */
public class Exercise03_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a value for a ,b ,c ,d ,e , and f (Make sure to leave a space between each number): ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		double y = 0;
		double x = 0;
		
		if(a*c - b*c == 0) {
			
		}else {
		
		x = (e*d - b*f)/ (a*d - b*c);
		y = (a*f - e*c)/ (a*d - b*c);
		
		}
		
		System.out.print(a);
		System.out.print();

		System.out.print();

		System.out.print();

		System.out.print();

		
		
		
		

	}

}
