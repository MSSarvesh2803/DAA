import java.util.*;
public class arraymax
{
    public static void main(String[] args)
    {
        int n,count=0;
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(max<arr[i])
            {
                count++;
                max=arr[i];
            }
        }
        System.out.println("maximum : "+max);
        System.out.println("count: "+count);
        sc.close();
    }
}