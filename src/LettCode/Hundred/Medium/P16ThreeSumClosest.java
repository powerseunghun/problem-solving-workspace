package LettCode.Hundred.Medium;

import java.util.Arrays;

public class P16ThreeSumClosest {
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = 0, sum = 0, res = 0;
        int diff = 3001;
        for (int i = 0, tDiff = 0; i < nums.length-1; i++) {
        	left = i+1;
        	right = nums.length-1;
        	while (left < right) {
        		sum = nums[i] + nums[left] + nums[right];
        		if (sum == target) return sum;
        		tDiff = Math.abs(target-sum);
        		if (tDiff < diff) {
        			diff = tDiff;
        			res = sum;
        		}
        		if (sum < target) left++;
        		else right--;
        	}
        }
    	return res;
    }
	public static void main(String[] args) {
		int nums[] = { -1, 2, 1, -4 };
		System.out.print(threeSumClosest(nums, 1));
	}
}
