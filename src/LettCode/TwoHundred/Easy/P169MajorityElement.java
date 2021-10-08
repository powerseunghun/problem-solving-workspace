package LettCode.TwoHundred.Easy;

import java.util.Arrays;

public class P169MajorityElement {
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
	public static void main(String[] args) {
		
	}
}
