public class Sort_Colors_75 {

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 1, 2, 1, 0, 0 };
        sortColors(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void sortColors(int[] nums) {
        int c1 = 0, c2 = 0, c0 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c0++;

            } else if (nums[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        for (int i = 0; i < nums.length; i++) {

            if (c0 != 0) {
                nums[i] = 0;
                c0--;
            } else if (c1 != 0) {
                nums[i] = 1;
                c1--;
            } else {
                nums[i] = 2;
                c2--;
            }
        }

    }

}
