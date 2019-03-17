package demoproject;

import java.util.Scanner;

public class Agecondition {

	public static void main(String[] args) {
		int age;
		@SuppressWarnings("resource")
		Scanner inputDevice=new Scanner(System.in);
		System.out.print("Enter your age");
		age=inputDevice.nextInt();
		if (age>18)
		{
			System.out.println("your age is above 18");
		}
		
		
		
	}

}
