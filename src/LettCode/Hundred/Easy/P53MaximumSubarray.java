package LettCode.Hundred.Easy;

public class P53MaximumSubarray {
    static int maxSubArray(int[] nums) {
    	int[] dp = new int[nums.length];
    	int max = nums[0];
    	dp[0] = nums[0];
    	
    	for (int i = 1; i < nums.length; i++) {
    		dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
    		max = Math.max(max, dp[i]);
    	}
        return max;
    }
	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArray(nums));
	}
}
