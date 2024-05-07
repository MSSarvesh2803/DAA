import java.util.*;
public class quick_sort 
{
    public static void display(int[] arr, int size)
    {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //int size = a.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        display(arr, n);
        quickSort(arr, 0, n - 1);
        display(arr, n);
        sc.close();
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int index  = partition(arr, low, high);

            quickSort(arr, low, index- 1);
            quickSort(arr, index+ 1, high);
        }
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int swapIndex  = (low - 1);

        for (int j = low; j <= high- 1; j++)
        {
            if (arr[j] < pivot)
            {
                swapIndex++;
                swap(arr, swapIndex, j);
            }
        }
        swap(arr, swapIndex + 1, high);

        return (swapIndex + 1);
    }
}
