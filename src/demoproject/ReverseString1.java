package demoproject;

public class ReverseString1 {
	
	
	public static void ReverseString(String str)
	{
		
		
		String Revstr="";
		
		
	for(int i=str.length()-1;i>=0;i--)
	{
		Revstr=Revstr+str.charAt(i);
		
		
	}
	
	System.out.println("the revernse string is " + Revstr);
		
	}

	public static void main(String[] args) {
		
		ReverseString("Bheemesh");
		
		

	}

}
