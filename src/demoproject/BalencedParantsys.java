package demoproject;

import java.util.Stack;

public class BalencedParantsys {

	public static void main(String[] args) {
		
		String str="[{())}";
		
	Stack<Character> stk=new Stack<>();
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='{' || str.charAt(i)=='[' ||str.charAt(i)=='(')
		{
			stk.push(str.charAt(i));
		}
		
		else if (!stk.isEmpty() && (str.charAt(i)==')' && stk.peek()=='(' || 
				str.charAt(i)==']' && stk.peek()=='[' || str.charAt(i)=='}' && stk.peek()=='{'))
		{
			stk.pop();
		}
		
		else
		{
			stk.push(str.charAt(i));
		}
		
	}
	
	if(stk.isEmpty())
	{
		System.out.println("Given paranthsys is balenced");
	}
	else
	{
		System.out.println("Given paranthisys is not balenced");
	}
		
	}

}
