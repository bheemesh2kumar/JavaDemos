package demoproject;

public class demomethods {
	
	

	public static void main(String[] args) {
		
		demomethods demo1=new demomethods();
		demo1.displaymsg();
		demo1.addition(5, 6);
		//System.out.println("the value of addition " + z);
		
		
	}
	
	  public void displaymsg()
	  {
		  System.out.println("you are succcessfully printed message");
	  }
	  
	  
	   public int addition(int x,int y)
	   {
		  
		  int z=x+y;
		   return z;
		   //System.out.println("the  value of addition" + z);
		   
		   
		   }
	   
	   
	   
	   public int multiplication(int x,int y)
	   
	   {
		   int z=(x*y);
		   return z;
		   
		   
		   
	   }
	   
	   
	  
	  

}
