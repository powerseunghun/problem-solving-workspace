package LettCode.TwoHundred.Easy;

import java.util.HashMap;
import java.util.Map;

public class P136SingleNumber {
    static Map<Integer, Integer> map = new HashMap<>();
    static int singleNumber(int[] nums) {
    	map.clear();
        for (int i = 0, val = 0; i < nums.length; i++) {
            val = nums[i];
            if (!map.containsKey(val)) {
                map.put(val, 1);
            }
            else map.remove(val);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(singleNumber(nums));
	}
}
