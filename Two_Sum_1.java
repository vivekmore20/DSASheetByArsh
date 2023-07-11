import java.util.*;
public class Two_Sum_1 {
    public static void main(String[] args) {
        int[] arr={2,7,11,19};
        int target=9;
        int res[]=twoSum(arr,target);
        System.out.println("res1="+res[0]+" res2="+res[1]);


        //System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    
    public static int[] twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==target-arr[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //Another approach by using hashmap with time complexity O(n) and space complexity O(n)

    // public static int[] twoSum(int[] nums, int target) {
    //     Map<Integer, Integer> map = new HashMap<>();
        
    //     for (int i = 0; i < nums.length; i++) {
    //         int complement = target - nums[i];
    //         if (map.containsKey(complement)) {
    //             return new int[] { map.get(complement), i };
    //         }
    //         map.put(nums[i], i);
    //     }
        
    //      return null;
    // }
}
