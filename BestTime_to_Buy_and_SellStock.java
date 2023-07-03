public class BestTime_to_Buy_and_SellStock {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int a = maxProfit(arr);
        System.out.println("Maximum Profit=" + a);

    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            int max = prices[i] - min;
            maxProfit = Math.max(maxProfit, max);
        }
        return maxProfit;
    }
}
