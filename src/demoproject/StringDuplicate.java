package demoproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StringDuplicate {
	
	public static void getduplicats(String arry[])
	{
		Map<String,Integer> hashref=new HashMap<String,Integer>();
		
		for(String elments:arry)
		{
			Integer counter=hashref.get(elments);
			
			if(counter==null)
			{
				hashref.put(elments, 1);
			}
			else
			{
				hashref.put(elments, ++counter);
			}
		}
		
		Set<Entry<String,Integer>> entry=hashref.entrySet();
		
		for(Entry<String,Integer> entryvals:entry)
		{
			if(entryvals.getValue()>1)
			{
				System.out.println(entryvals.getKey() + " " + entryvals.getValue());
			}
		}
		
		
		
		
	
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string elemetns");
		
	String str[]=new String[5];
		for(int i=0;i<5;i++)
		{
			str[i]=sc.next();
			
		}
		
		getduplicats(str);
	}

}
