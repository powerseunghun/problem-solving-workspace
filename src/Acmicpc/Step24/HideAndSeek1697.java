package Acmicpc.Step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class HideAndSeek1697 {
	static int[] time = new int[100001];
	static boolean[] check = new boolean[100001];
	static Queue<Integer> q = new LinkedList<>();
	static int[] newD = {-1, 1, 2};
	static boolean check(int newDir, int N) {
		if (newDir < 0 || newDir > time.length-1) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int max = Math.max(N, M);
		Arrays.fill(time, Integer.MAX_VALUE);
		
		q.add(N);
		time[N] = 0;
		check[N] = true;
		
		while (!q.isEmpty()) {
			int tD = q.poll();
			
			if (tD == M) {
				System.out.println(time[tD]);
				return;
			}
			for (int i = 0; i < newD.length; i++) {
				int newDir = i == newD.length-1 ? tD * 2 : tD + newD[i];
				if (check(newDir, max) && !check[newDir]) {
					q.add(newDir);
					check[newDir] = true;
					time[newDir] = Math.min(time[tD]+1, time[newDir]);
				}
			}
		}
	}
}
