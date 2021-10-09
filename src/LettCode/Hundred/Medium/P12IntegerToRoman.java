package LettCode.Hundred.Medium;

import java.util.HashMap;
import java.util.Map;

public class P12IntegerToRoman {
    static Map<Integer, String> map = new HashMap<>();
	static int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	static String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
	static void mapInit() {
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], romans[i]);
		}
	}
    static String intToRoman(int num) {
        mapInit();
    	int idx = 0;
    	String str = "";
    	while (num != 0) {
    		if (num >= nums[idx]) {
    			str += map.get(nums[idx]);
    			num -= nums[idx];
    		}
    		else idx++;
    	}
        return str;
    }
	public static void main(String[] args) {
		System.out.println(intToRoman(3999));
	}
}
