package demoproject;

import java.util.Scanner;

public class ReverseArray1 {
	
	public  static int[] sortedArray(int arryelements[])
	{
		int start=0;
		int last=arryelements.length-1;
		int temp;
		while (start<last)
		{
			temp=arryelements[start];
			arryelements[start]=arryelements[last];
			arryelements[last]=temp;
			start++;
			last--;
		}
		
		return arryelements;
	}
	
	
	

	public static void main(String[] args) {
		
		
		int arryele[]={5,7,3,9,4};
		System.out.println("Array Elements before reversed");
		for(int ele1:arryele)
		{
			System.out.print(ele1);
		}
		
		int finalarry[]=sortedArray(arryele);
		System.out.println("\n Array Elements after reversed");
		for(int ele:finalarry)
		{
			System.out.print(ele);
		}
		
		
	}

}
