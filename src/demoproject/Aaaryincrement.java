package demoproject;

public class Aaaryincrement {
	
	
	public static int[] increment(int[] val) {
	    for (int i = val.length - 1; i >= 0; i--) {
	    //	System.out.println("*************" + val[i]);
	        if (++val[i] < 10)
	            return val;
	        val[i] = 0;
	    }
	    val = new int[val.length + 1];
	    val[0] = 1;
	    return val;
	}

	public static void main(String[] args) {
		
		int x[]={2,3,7,5,9,10};
		
		for(int num:x)
		{
			System.out.print(num);
		}
		System.out.println("the length is" +x.length );
		int array[]=increment(x);
		
		for(int num1:array)
		{
			System.out.print(num1);
		}
		
		
		System.out.println("the  length of new array is " + array.length);
		
		
		
		
		

	}

}
