package Com.Java.InterviewDemos;

public class Fibanaciseries {

	public static void main(String[] args) {
		String Required="Hello";
		
		CountofEachWord(Required);
		
		String s2="eagle";
		System.out.println(s2+ s2.length());
}
	
	public static void CountofEachWord(String str )
	{
		char Ch[]=str.toCharArray();
		
		for(int i=0;i<Ch.length;i++)
		{
			String  eachwrd="";
			
			while(i<Ch.length && Ch[i]!= ' ')
			{
				eachwrd=eachwrd+Ch[i];
				i++;
			}
			
			
			System.out.println("Each String" + " "+ eachwrd + " "+ eachwrd.length() );
		
		}
				
		
	}
	
	
}
