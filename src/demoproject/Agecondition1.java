package demoproject;

import java.util.Scanner;

public class Agecondition1 {

	public static void main(String[] args) {
		int age ;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your Age");
		
	age=input.nextInt();
	
	if (age>=18)
	{
		System.out.println("your are older");
	}
	
	else
		System.out.println("your are youger");
	
		
		

	}

}
