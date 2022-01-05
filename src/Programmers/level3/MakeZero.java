package Programmers.level3;

import java.util.ArrayList;

public class MakeZero {
	static boolean[] check = null;
	static ArrayList<Integer>[] child = null;
	static long[] count = null;
	static long answer = 0;
	static long dfs(int v) {
		check[v] = true;
		for (int i = 0; i < child[v].size(); i++) {
			if (!check[child[v].get(i)]) {
				count[v] += dfs(child[v].get(i));
			}
		}
		answer += Math.abs(count[v]);
		
		return count[v];
	}
	static long solution(int[] a, int[][] edges) {
        check = new boolean[a.length];
        child = new ArrayList[a.length];
        count = new long[a.length];
        
        for (int i = 0; i < a.length; i++) {
        	answer += a[i];
        	count[i] = a[i];
        	child[i] = new ArrayList<>();
        }
        if (answer != 0) return -1;
        
        for (int i = 0, edge1 = 0, edge2 = 0; i < edges.length; i++) {
        	edge1 = edges[i][0];
        	edge2 = edges[i][1];
        	child[edge1].add(edge2);
        	child[edge2].add(edge1);
        }
        dfs(0);
        
        return answer;
    }
	public static void main(String[] args) {
		int[] a = {-5, 0, 2, 1, 2};
		int[][] edges = {{0,1},{3,4},{2,3},{0,3}};
		
		System.out.println(solution(a, edges));
	}
}
