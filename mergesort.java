import java.util.Scanner;
public class mergesort {
    void merge(char arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        char L[] = new char[n1];
        char R[] = new char[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(char arr[], int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;
  
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    static void printArray(char arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("\nGiven array");
        printArray(arr);
  
        mergesort ob = new mergesort();
        ob.sort(arr, 0, arr.length - 1);
        printArray(arr);
        sc.close();
    }
}
