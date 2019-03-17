package Com.AbstractionDemo;

public abstract class RbiBank {
	
	int minbal=500;
	
	public abstract void debit();
	public abstract void credit();
	public abstract void current();
	
	public void intrest()
	{
		System.out.println("Bank provides intrest %" + " " + "20%");
	}
	
	public void Discount()
	{
		System.out.println("Bank provides discount %" + " " + "10%");
	}
	
	
	

}
