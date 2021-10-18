package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P90Subsets2 {
    static List<List<Integer>> list = new ArrayList<>();
	static Set<String> set = new HashSet<>();
	static int[] arr = null;
	static boolean checkDuplicate(int d, int[] arr) {
		int[] checkArr = new int[d];
		for (int i = 0; i < d; i++) {
			checkArr[i] = arr[i];
		}
		Arrays.sort(checkArr);
		String str = "";
		for (int el : checkArr) {
			str += (el + "");
		}
		if (!set.contains(str)) {
			set.add(str);
			return true;
		}
		else return false;
	}
	static void dfs(int n, int d, int idx, int[] nums) {
		if (d >= n) {
			List<Integer> t = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				t.add(arr[i]);
			}
			if (checkDuplicate(d, nums)) {
				list.add(t);
			}
			return;
		}
		
		List<Integer> t = new ArrayList<>();
		for (int i = 0; i < d; i++) {
			t.add(arr[i]);
		}
		if (checkDuplicate(d, arr)) {
			list.add(t);
		}
		
		for (int i = idx; i < nums.length; i++) {
			arr[d] = nums[i];
			dfs(n, d+1, i+1, nums);
		}
	}
    static List<List<Integer>> subsetsWithDup(int[] nums) {
    	list.clear();
    	set.clear();
        arr = new int[nums.length];
    	dfs(nums.length, 0, 0, nums);
    	
        return list;
    }
    public static void main(String[] args) {
		
	}
}
