package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.List;

public class P77Combinations {
    static int[] arr = null;
    static List<List<Integer>> list = new ArrayList<>();
	static void dfs(int n, int k, int d, int idx) {
		if (d >= k) {
            List<Integer> t = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
                t.add(arr[i]);
			}
            list.add(t);
			return;
		}
		for (int i = idx+1; i <= n; i++) {
			arr[d] = i;
			dfs(n, k, d+1, i);
		}
	}
    static List<List<Integer>> combine(int n, int k) {
        list.clear();
        arr = new int[k];
        dfs(n, k, 0, 0);
        
        return list;
    }
	public static void main(String[] args) {
		System.out.println(combine(4, 2));
	}
}
