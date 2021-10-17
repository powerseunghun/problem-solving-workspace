package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.List;

public class P78Subsets {
	static List<List<Integer>> list = new ArrayList<>();
	static int[] arr = null;
	static void dfs(int n, int d, int idx, int[] nums) {
		if (d >= n) {
			List<Integer> t = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				t.add(arr[i]);
			}
			list.add(t);
			return;
		}
		
		List<Integer> t = new ArrayList<>();
		for (int i = 0; i < d; i++) {
			t.add(arr[i]);
		}
		list.add(t);
		
		for (int i = idx; i < nums.length; i++) {
			arr[d] = nums[i];
			dfs(n, d+1, i+1, nums);
		}
	}
    public List<List<Integer>> subsets(int[] nums) {
    	list.clear();
        arr = new int[nums.length];
    	dfs(nums.length, 0, 0, nums);
    	
        return list;
    }
	public static void main(String[] args) {
	}
}
