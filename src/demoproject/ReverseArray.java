package demoproject;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int num=sc.nextInt();
		
		int arry[]=new int[num];
		System.out.println("Enter array elements ");
		
		for(int i=0;i<arry.length;i++)
		{
			arry[i]=sc.nextInt();
		}
		
	System.out.println("arrya elements are ");
	for(int j=0;j<arry.length;j++)
	{
		System.out.print(arry[j] + ",");
	}
		
		
		
		
		
		

	}

}
