import java.util.*;
public class binarysearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,target,count=0,m=0;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        target=sc.nextInt();
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            m=(l+r)/2;
            if(arr[m]==target)
            {

                count=1;
                break;
            }
            else if(arr[m]>target)
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        if(count==1)
        {
            System.out.println("Position of the Key is "+m);
        }
        else
        {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
