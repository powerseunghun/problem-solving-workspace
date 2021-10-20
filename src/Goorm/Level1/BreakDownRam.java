package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BreakDownRam {
	static Set<Long> set = new HashSet<>();
	static void setInit() {
		long n = 1;
		for (int i = 1; i <= 31; i++) {
			n *= 2;
			set.add(n);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), count = 0;
		long[] rams = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < rams.length; i++) {
			rams[i] = Long.parseLong(st.nextToken());
		}
		setInit();
		
		for (int i = 0; i < rams.length; i++) {
			if (!set.contains(rams[i])) {
				count++;
				sb.append((i+1) + " ");
			}
		}
		System.out.println(count);
		System.out.println(sb.toString());
	}
}
