class BoolTest
{
	public static void main(String args[])
	{
		boolean b;
		b=false;
		System.out.println("b is "+b);
		b=true;
		System.out.println("b is "+b);
		if(b)
		{
			System.out.println("Ths is executed ");
		}
		b=false;
		if(b)
		{
			System.out.println("This is not executed ");
		}
		System.out.println("10>9 is "+(10>9));
		
	}
}



E:\JDK\javaprograms>java BoolTest
b is false
b is true
Ths is executed
10>9 is true

