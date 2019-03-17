package Com.Java.InterviewDemos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicatestrings {

	public static void main(String[] args) {
		String names[]={"java","C#","java","C#","java","C#"};
		
		
		//using hashset 
		
		
		
		//using hashmap tecnique 
		System.out.println("using hashmap***************");
		
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		new HashSet<String>();
		
		
		for(String name:names)
		{
			Integer counter=hashmap.get(name);
			
			if (counter==null)
			{
				hashmap.put(name, 1);
			}
			
			
			else
			{
				hashmap.put(name, ++counter);
			}
		}
		
		//getting values from hashmap
		Set<Entry<String, Integer>> entryref=hashmap.entrySet();
		
		for(Entry<String, Integer> entry:entryref)
		{
			if(entry.getValue()>1)
			{
				System.out.println("the duplicate value is " + " " +entry.getKey() + " " + entry.getValue());
			}
		}
		
		
		//using hashset
		System.out.println("using hashset*******************");
		Set<String> hashset=new HashSet<String>();
		
		int count=0;
		
		for (String name:names)
		{
			if(hashset.add(name)==false)
			{
				System.out.println("duplicate  element is" + " "+ name + ++count);
			}
		}
		

	}

}
