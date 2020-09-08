package io.lambda;

public class Greeter 
{
	public void greet(Greeting gi)
	{
		gi.perform();
	}
	public static void main(String[] args) 
	{
		Greeter g = new Greeter();
		//g.greet();
		GreetingIm gim = new GreetingIm();
		
		g.greet(gim);
	}

}
