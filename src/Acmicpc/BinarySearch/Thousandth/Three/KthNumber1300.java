package Acmicpc.BinarySearch.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KthNumber1300 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long K = Long.parseLong(br.readLine());
		long l = 1, r = K, ans = -1, m = 0, count = 0;
		
		// logic j lower than mid (i*j <= m) 
		while (l <= r) {
			count = 0;
			m = (l+r) / 2;
			for (int i = 1; i <= N; i++) {
				count += Math.min(m/i, N);
			}
			if (count < K) l = m+1;
			else {
				ans = m;
				r = m-1;
			}
		}
		System.out.println(ans);
	}
}
