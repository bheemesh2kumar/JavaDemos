package Com.InterfacesDemo;

public class TestInterface implements USBank,BrezilBank

{
    public int Credit()
    {
    	System.out.println("this is US bank Credit rule");
    	return 22;
    }
	
	public void Debit()
	{
		System.out.println("this is US bank Debit rule");
	}
	
	
	public void Saving() 
	{
		System.out.println("THis is saving account");
		
		
	}
	
	
    public void MutualFund()
    {
    	System.out.println("This is Mutual fund");
    }
	
	public void EquityFund()
	{
		System.out.println("THis is equity funds");
	}

	
	public void Bonds() 
	{
		System.out.println("th is bonds");
	}
	
	
	
	
	
	
	
	
}

