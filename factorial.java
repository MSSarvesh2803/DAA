import java.util.*;
public class factorial
{
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        int result=fact(n);
        System.out.println("THE FACTORIAL = "+result);
        sc.close();
	}
    static int fact(int a)
    {
        if(a==0)
        {
            return 1;
		}
        else
        {
            return fact(a-1)*a;
		}
	}
}
