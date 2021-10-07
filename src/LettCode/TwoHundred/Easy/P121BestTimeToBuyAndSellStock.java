package LettCode.TwoHundred.Easy;

public class P121BestTimeToBuyAndSellStock {
    static int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE, sum = 0;
        
        for (int i = 0; i < prices.length; i++) {
            minVal = Math.min(minVal, prices[i]);
            sum = Math.max(sum, prices[i]-minVal);
        }
        return sum;
    }
    public static void main(String[] args) {
		
	}
}
