import java.util.*;
public class ChoclateIDistributionProblem {
    public static void main(String[] args)
    {
        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                      40, 28, 42, 30, 44, 48, 43, 50 };
 
        int m = 7; 
 
        int n = arr.length;
        System.out.println("Minimum difference is "
                           + findMinDiff(arr, n, m));
    } 
    public static int findMinDiff(int arr[],int n,int m){

        if(n<m){
            return -1;
        }
        Arrays.sort(arr);

        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff=arr[i+m-1]-arr[i];
            if(diff<min){
                min=diff;
            }
        }
        return min;
    } 

}
