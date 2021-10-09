package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P153Sum {
	static List<List<Integer>> list = new ArrayList<>();
	static Set<String> set = new HashSet<>();
	static int[] arr = new int[3];
	static int[] nums = {-1,0,1,2,-1,-4};
	static void dfs(int n, int d, int idx) {
		if (d >= n) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			if (sum == 0) {
				List<Integer> tmp = new ArrayList<>();
				String str = "";
				for (int i = 0; i < arr.length; i++) {
					tmp.add(arr[i]);
				}
				int[] tArr = arr.clone();
				Arrays.sort(tArr);
				for (int i = 0; i < tArr.length; i++) {
					str += tArr[i];
				}
				if (!set.contains(str)) {
					set.add(str);
					list.add(tmp);
				}
			}
			return;
		}
		
		for (int i = idx; i < nums.length; i++) {
			arr[d] = nums[i];
			dfs(n, d+1, i+1);
		}
	}
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<Integer> l = new ArrayList<>();
		dfs(3, 0, 0);
		System.out.println(list.size());
	}
}
