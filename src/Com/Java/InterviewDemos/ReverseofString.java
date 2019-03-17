package Com.Java.InterviewDemos;

public class ReverseofString {

	public static void main(String[] args) {
		String OriginalMsg="Bhavishni";
		DoReverse(OriginalMsg);
		
		/*StringBuffer sf=new StringBuffer(OriginalMsg);
		System.out.println("the reverse of" + sf.reverse());*/
		

	}
	
	public static void DoReverse(String Msg)
	{
	
		String str="";
		for(int i =Msg.length()-1;i>=0;i--)
		{
			str=str+Msg.charAt(i);
		}
		
		System.out.println("The reverse of string is" + " "+ str);
		
		
		//second method 
		
		StringBuffer sf=new StringBuffer(Msg);
		System.out.println("the reverse of" + sf.reverse());	
		
		
	}
	

}
