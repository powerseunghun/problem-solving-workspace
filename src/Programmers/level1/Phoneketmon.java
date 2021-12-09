package Programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {
	static Set<Integer> set = new HashSet<>();
	public int solution(int[] nums) {
        int answer = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
        	set.add(nums[i]);
        }
        return Math.min(set.size(), answer);
    }
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		
	}
}
