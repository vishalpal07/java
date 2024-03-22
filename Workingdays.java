public class Workingdays
{
	enum Days
	{
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday,
	}
	public static void main(String args[])
	{
		for(Days d : Days.values())
		{
			weekend(d);
		}
	}
	private static void weekend(Days d)
	{
		if(d.equals(Days.Sunday))
			System.out.println("Value = " + d + " is a Holiday ");
		else
			System.out.println("Value = " + d + " is a working day ");

	}
}

/*

Value = Sunday is a Holiday
Value = Monday is a working day
Value = Tuesday is a working day
Value = Wednesday is a working day
Value = Thursday is a working day
Value = Friday is a working day
Value = Saturday is a working day

*/