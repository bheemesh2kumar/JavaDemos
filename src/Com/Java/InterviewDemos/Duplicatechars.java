package Com.Java.InterviewDemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicatechars {
	
	public static void getduplicatechars(String str)
	{
		Map<Character,Integer> haspref=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			
			if (! haspref.containsKey(str.charAt(i)))
			{
				haspref.put(str.charAt(i),1);
			}
			else 
			{
				Integer Count=haspref.get(str.charAt(i));
				haspref.put(str.charAt(i),++Count);
			}
			
		}
		
		
		Set<Entry<Character,Integer>> hashsetval=haspref.entrySet();
		
		
		for(Entry<Character,Integer> entry:hashsetval)
		{
			if(entry.getValue()>1)
			{
				System.out.println("the duplicate charcters are"+ " " + entry.getKey() + " " + entry.getValue() );
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		getduplicatechars("Bheemeswararao");

	}

}
