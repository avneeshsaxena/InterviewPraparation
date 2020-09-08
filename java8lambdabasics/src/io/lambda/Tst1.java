package io.lambda;

public class Tst1 
{
	public static void main(String args[])
	{
		TsttI1 it = (uname,password)->{
			
			if(uname.equals("avneesh"))
			{
				return "Success";
			}else
			{
				return"fail";
			}
			
		};
		String s = it.login("avneesh", "password");
		System.out.println(s);
	}

}
