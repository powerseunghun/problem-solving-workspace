package Acmicpc.As.B3.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MeanWords31663 {
	static int[] sum = null, cnt = null;
	static final int l = 45;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int N = Integer.parseInt(br.readLine());
		sum = new int[l]; 
		cnt = new int[l];
		
		while(N-- > 0) {
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				sum[i] += str.charAt(i);
				cnt[i]++;
			}
		}
		
		for (int i = 0; i < sum.length; i++) {
			if (cnt[i] == 0) break;
			sb.append((char)(sum[i]/cnt[i]));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
