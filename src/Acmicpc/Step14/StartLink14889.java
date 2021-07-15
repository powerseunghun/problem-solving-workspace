package Acmicpc.Step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StartLink14889 {
	static int[][] ability = null;
	static boolean[] check = null;
	static int[] teamStart = null;
	static int[] teamLink = null;
	static int minDiff = Integer.MAX_VALUE;
	static int getPower(int[] teamList) {
		int sum = 0;
		for (int i = 0; i < teamList.length; i++) {
			for (int j = 0; j < teamList.length; j++) {
				if (i == j) continue;
				sum += ability[teamList[i]-1][teamList[j]-1];
				sum += ability[teamList[j]-1][teamList[i]-1];
			}
		}
		return sum / 2;
	}
	static void bt(int d, int n, int startIdx) {
		if (d >= (n / 2)) {
			int teamLinkIdx = 0, teamStartPower = 0, teamLinkPower = 0, powerDiff = 0;
			for (int i = 0; i < check.length; i++) {
				if (!check[i]) {
					teamLink[teamLinkIdx++] = i+1;
				}
			}
			teamStartPower = getPower(teamStart);
			teamLinkPower = getPower(teamLink);
			powerDiff = Math.abs(teamStartPower - teamLinkPower);
			minDiff = minDiff >= powerDiff ? powerDiff : minDiff;
			return;
		}
		
		for (int i = startIdx; i <= n; i++) {
			if (!check[i-1]) {
				teamStart[d] = i;
				check[i-1] = true;
				bt(d+1, n, i+1);
				check[i-1] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ability = new int[N][N];
		check = new boolean[N];
		teamStart = new int[N/2];
		teamLink = new int[N/2];
		Arrays.fill(check, false);
		StringTokenizer st = null;
		
		for (int i = 0; i < ability.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < ability[i].length; j++) {
				ability[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bt(0, N, 1);
		System.out.println(minDiff);
	}
}
