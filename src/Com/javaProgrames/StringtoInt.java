package Com.javaProgrames;

public class StringtoInt {
	
	 public static int getintnumber(String str)
	{
		 
		 int sum=0;
		 
		 for(int i=0;i<str.length();i++)
		 {
			 sum=sum*10;
			 sum=sum+((int)str.charAt(i)-(int)'0');
			 
		 }
		 
	return sum;
	
	}
	
	
	

	public static void main(String[] args) {
		
		
		String str1="987654";
		
		
		int num=getintnumber(str1);
		System.out.println(num);
		
		
		
		

	}

}
