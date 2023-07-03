import java.util.*;
public class MoveZeroes {

     public static void main(String[] args) {
        int arr[]={7,8,9,0,6,0,6,4,};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[count++]=nums[i];
                
            }
        }
        while(count<n)
        {
            nums[count++]=0;
        }
        
    }
}
