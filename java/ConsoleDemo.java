import java.io.*;
class ConsoleDemo
{
	public static void main(String args[])
	{
		String str;
		Console con;
		con = System.console();
		if(con == null)
			return;
		str = con.readLine("Enter a string : ");
		con.printf("Here is your string : %s\n", str);
	}
}

/*

Enter a string : Hello World
Here is your string : Hello World

*/