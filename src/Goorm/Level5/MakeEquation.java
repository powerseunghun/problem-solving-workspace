package Goorm.Level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeEquation {
	static int[] num = null;
	static Long count = 0L;
	static void search(int n, int d, int sum) {
		if ((sum < 0) || (!(sum >= 0 && sum <= 20))) return;
		
		if (d >= n-1) {
			if (sum == num[d]) count++;
			return;
		}
		
		for (int i = 0; i < 2; i++) {
			switch(i) {
			case 0:
				search(n, d+1, sum+num[d]);
				break;
			case 1:
				search(n, d+1, sum-num[d]);
				break;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		num = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		search(N, 0, 0);
		
		System.out.println(count);
		br.close();
	}
}
