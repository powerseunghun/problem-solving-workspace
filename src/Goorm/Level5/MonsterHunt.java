package Goorm.Level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MonsterHunt {
	static int[] arr = null;
	static int[] die = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), dieCount = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		arr = new int[N];
		die = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int idx = 0, time = 1; ; time++) {
			while (arr[idx] <= 0) {
				idx = (idx+1) % arr.length;
			}
			arr[idx]--;
			if (arr[idx] == 0) {
				dieCount++;
				die[idx] = time;
			}
			if (dieCount == arr.length) break;
			idx = (idx+1) % arr.length;
		}
		for (int i = 0; i < die.length; i++) {
			sb.append(die[i] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
