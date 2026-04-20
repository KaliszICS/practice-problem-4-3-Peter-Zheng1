/**

        * File: Lesson 4.3 

        * Author: Peter

        * Date Created: April 20, 2026

        * Date Last Modified: April 20, 2026

        */

import java.util.Scanner;

public class PracticeProblem {


	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a positive integer: ");
		int posInt = input.nextInt();

		do{
			if (posInt < 0){
				System.out.print("Input a positive integer: ");
				posInt = input.nextInt();
			}
		} while (posInt < 0);

		System.out.println(posInt * 2);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		String password;
		String confirm;

		do{
			System.out.print("Input a password: ");
			password = input.nextLine();

			System.out.print("Confirm the password: ");
			confirm = input.nextLine();

		} while (!password.equals(confirm));
		System.out.println("success.");
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		int num;
		int multNum;
	

		do{
			System.out.print("Input an integer: ");
			num = input.nextInt();
			
			System.out.print("Input an integer that is a multiple of the first integer: ");
			multNum = input.nextInt();

		} while (!(multNum % num == 0));

		System.out.println("success.");
	}
}
