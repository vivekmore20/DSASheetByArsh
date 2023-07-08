import java.util.*;
class SubArray_With_Sum_k506 {
    public static void main(String[] args) {
        int arr[]={1,1,1};
      // System.out.println(subarraySum(arr,2));
      fun(1,5);
    }
    public static void fun(int i,int n){
        if(i>n){
            return;
        }
        fun(i+1,n);
        System.out.println(i);
        

    }

    public static int subarraySum(int[] nums, int k) {
        
       HashMap<Integer,Integer> map=new HashMap();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }else{
                map.put(sum,map.get(sum)+1);
            }
            System.out.println(map);
        }
        return count;
    
}
}
