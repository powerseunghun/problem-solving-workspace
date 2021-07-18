package Acmicpc.Step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SetRouterDist2110 {
	static int[] home = null;
	static boolean check(int dist, int C) {
		long cnt = 1;
		int base = home[0];
		for (int i = 1; i < home.length; i++) {
			if (home[i] - base >= dist) {
				cnt++;
				base = home[i];
			}
		}
		if (cnt >= C) return true;
		else return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		int left = 1, right = 0, dist = 0, setDist = 0;
		home = new int[N];
		
		for (int i = 0; i < home.length; i++) {
			home[i] = Integer.parseInt(br.readLine());
			right = Math.max(home[i], right);
		}
		Arrays.sort(home);
		
		while (left <= right) {
			dist = (left + right)/2;
			if (check(dist, C)) {
				setDist = dist > setDist ? dist : setDist;
				left = dist+1;
			}
			else right = dist-1;
		}
		System.out.println(setDist);
	}
}
