import java.util.*;
public class subset1 
{
    public static void findSubsets(int[] X, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subsetSumHelper(X, targetSum, 0, subset, result);
        for (List<Integer> subResult : result) {
            System.out.println(subResult);
        }
    }
    public static void subsetSumHelper(int[] X, int targetSum, int index, List<Integer> subset, List<List<Integer>> result) {
        if (targetSum == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (index == X.length || targetSum < 0) {
        return;
    }
    subset.add(X[index]);
    subsetSumHelper(X, targetSum - X[index], index + 1, subset, result);
    subset.remove(subset.size() - 1);
    subsetSumHelper(X, targetSum, index + 1, subset, result);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int X[]=new int[n];
    for(int i=0;i<n;i++)
    {
        X[i]=sc.nextInt();
    }
    int targetSum=sc.nextInt();
    findSubsets(X, targetSum);
    sc.close();
    }
}