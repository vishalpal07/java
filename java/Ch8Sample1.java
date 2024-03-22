import java.util.*;

class Ch8Sample1
{
    public static void main(String[] args)
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int x,n,answer;
        System.out.println();
        System.out.print("Enter an integer for x: ");
        x = scanner.nextInt();
        System.out.print("Enter an integer for n: ");
        n = scanner.nextInt();

        System.out.println();

        if (x>=0 && n>=0 && ! (x==0 && n==0))
        {
            answer = power(x,n);
            System.out.println("The answer is " + answer);
        }
        else
            System.out.println("Power not calculated");
    }

    public static int power (int x, int n)
    {
        int answer;
        if (n > 0)
            answer = power (x,n-1)*x;
        else
            answer = 1;
        return answer;
    }
}


/*



D:\vishal\home-120324>javac Ch8Sample1.java

D:\vishal\home-120324>java Ch8Sample1

Enter an integer for x: 5
Enter an integer for n: 3

The answer is 125


*/