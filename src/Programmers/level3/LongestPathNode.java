package Programmers.level3;

import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int node;
	private int path;
	
	public Pos(int n, int p) {
		this.node = n;
		this.path = p;
	}
	
	public int getNode() {
		return node;
	}
	
	public void setNode(int node) {
		this.node = node;
	}

	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}
}
public class LongestPathNode {
	static boolean[][] path = null;
	static int[] check = null;
	static int solution(int n, int[][] edge) {
		int answer = 0, longestPath = 0;
        path = new boolean[n+1][n+1];
		check = new int[n+1];
		
		for (int i = 0; i < edge.length; i++) {
			path[edge[i][0]][edge[i][1]] = true;
			path[edge[i][1]][edge[i][0]] = true;
		}
		
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(1, 0));
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			
			for (int i = 2, node = 0; i <= n; i++) {
				node = tmp.getNode();
				if (path[node][i] && check[i] == 0) {
					check[i] = tmp.getPath()+1;
					q.add(new Pos(i, tmp.getPath()+1));
					longestPath = Math.max(longestPath, tmp.getPath()+1);
				}
			}
		}
		for (int i = 1; i < check.length; i++) {
			if (longestPath == check[i]) answer++;
		}
		
        return answer;
    }
	public static void main(String[] args) {
		int n = 6;
		int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		
		System.out.println(solution(n, edge));
	}
}
