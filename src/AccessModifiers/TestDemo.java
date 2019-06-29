package AccessModifiers;

 public  class TestDemo {
	
	
	public void publicmethod1()
	{
		System.out.println("this is public method in same public  class");
	}
	
	private void privatemethod2()
	{
		System.out.println("this is private method in same  private class");
	}
	
	
	protected void proteectedmethod3()
	{
		System.out.println("this is protected  method in sameprotected class");
	}
	
	void defaultmethod4()
	{
		System.out.println("this is default method in same class");
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		TestDemo TestDemoref=new TestDemo();
	
		
		
		
		
		
	}

}
