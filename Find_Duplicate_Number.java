public class Find_Duplicate_Number {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            
            if(nums[i]!=i+1)
            {
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct])
                {
                    swap(nums,i,correct);
                }else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        
        return -1;
    }
    public static void swap(int[] arr,int l,int r)
    {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

}
