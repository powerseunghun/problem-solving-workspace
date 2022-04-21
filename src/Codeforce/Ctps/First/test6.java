package Codeforce.Ctps.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test6 {
	static int[] arr = null;
	static void func() {
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0, l = 0, r = 0;
		int aliceSum = 0, bobSum = 0, total = 0;
		StringTokenizer st = null;
		
		for (int tc = 0; tc < t ; tc++) {
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			aliceSum = 0;
			bobSum = 0;
			total = 0;
			if (n % 2 == 0) {
				for (int i = 0; i < n/2; i++) {
					aliceSum += arr[i];
					total++;
				}
				l = (n/2)-1;
				for (int i = n/2; i < n; i++) {
					bobSum += arr[i];
					total++;
				}
				r = n/2;
			}
			else {
				for (int i = 0; i < n/2; i++) {
					aliceSum += arr[i];
					total++;
				}
				l = (n/2)-1;
				for (int i = (n/2)+1; i < n; i++) {
					total++;
					bobSum += arr[i];
				}
				r = (n/2)+1;
			}
			
			while (l <= r && ((l >= 0 && l < n) && (r >= 0 && r < n))) {
				if (l == r) {
					total = 0;
					break;
				}
			}
		}
	}
}
