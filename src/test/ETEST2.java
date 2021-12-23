package test;

import java.util.HashMap;
import java.util.Map;

public class ETEST2 {
	static int[] arr = null;
	static int max = Integer.MIN_VALUE;
	static int columnMax = Integer.MIN_VALUE;
	static Map<Integer, Integer> map = new HashMap<>();
	
	static void init(int[][] needs, int r) {
		arr = new int[r];
		columnMax = needs[0].length;
	}
	static void dfs(int n, int d, int idx, int[][] needs) {
		if (d >= n) {
			int count = 0;
			boolean flag = true;
			map.clear();
			for (int i = 0; i < arr.length; i++) {
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], 1);
				}
			}
			
			for (int i = 0; i < needs.length; i++) {
				// arr = [0, 1];
				// needs[i] = 1, 0, 0
				flag = true;
				for (int j = 0; j < needs[i].length; j++) {
					if (needs[i][j] != 0) {
						if (!map.containsKey(j)) {
							flag = false;
							break;
						}
					}
				}
				if (flag) count++;
			}
			max = Math.max(max, count);
			
			return;
		}
		
		for (int i = idx; i < columnMax; i++) {
			arr[d] = i;
			dfs(n, d+1, i+1, needs);
		}
	}
	static int solution(int[][] needs, int r) {
        init(needs, r);
        dfs(r, 0, 0, needs);
        
        return max;
    }
	public static void main(String[] args) {
		int r = 2;
		int[][] needs = {{1,0,0},{1,1,0},{1,1,0},{1,0,1},{1,1,0},{0,1,1}};
		solution(needs, r);
		
		System.out.println(max);
	}
}
