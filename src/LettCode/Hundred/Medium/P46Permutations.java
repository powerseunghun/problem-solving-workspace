package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.List;

public class P46Permutations {
    static List<List<Integer>> list = new ArrayList<>();
    static int[] arr = null;
    static boolean[] check = null;
    static void dfs(int n, int d, int[] nums) {
        if (d >= n) {
            List<Integer> tList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                tList.add(arr[i]);
            }
            list.add(tList);
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[d] = nums[i];
                dfs(n, d+1, nums);
                check[i] = false;
            }
        }
    }
    static List<List<Integer>> permute(int[] nums) {
        arr = new int[nums.length];
        check = new boolean[nums.length];
        list.clear();
        dfs(nums.length, 0, nums);
        
        return list;
    }
	public static void main(String[] args) {
		
	}
}
