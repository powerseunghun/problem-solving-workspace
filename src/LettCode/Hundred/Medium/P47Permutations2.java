package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P47Permutations2 {
    static int[] arr = null;
	static boolean[] visit = null;
	static Set<String> check = new HashSet<>();
    static List<List<Integer>> list = new ArrayList<>();
	static void dfs(int n, int d, int[] nums) {
		if (d >= n) {
			String str = "";
			for (int i = 0; i < arr.length; i++) {
				str += arr[i]+"";
			}
			if (!check.contains(str)) {
                List<Integer> tList = new ArrayList<>();
                for (int i = 0; i < arr.length; i++) {
                    tList.add(arr[i]);
                }
                list.add(tList);
				check.add(str);
			}
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!visit[i]) {
				arr[d] = nums[i];
				visit[i] = true;
				dfs(n, d+1, nums);
				visit[i] = false;
			}
		}
	}
    static List<List<Integer>> permuteUnique(int[] nums) {
        arr = new int[nums.length];
        visit = new boolean[nums.length];
        check.clear();
        list.clear();
        dfs(nums.length, 0, nums);
        
        return list;
    }
	public static void main(String[] args) {
	}
}
