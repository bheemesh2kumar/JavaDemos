package Com.AbstractionDemo;

public abstract class USBank {
	
int minbal=1000;
	
	public abstract void debitus();
	public abstract void creditus();
	public abstract void currentus();
	
	public void intrestus()
	{
		System.out.println("Bank provides intrest %" + " " + "30%");
	}
	
	public void Discountus()
	{
		System.out.println("Bank provides discount %" + " " + "20%");
	}


}
