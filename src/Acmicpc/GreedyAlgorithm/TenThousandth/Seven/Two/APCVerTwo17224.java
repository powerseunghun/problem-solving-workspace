package Acmicpc.GreedyAlgorithm.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APCVerTwo17224 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int L = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		int easy = 0, high = 0, sub1 = 0, sub2 = 0, ans = 0;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			easy = Integer.parseInt(tmp.split(" ")[0]);
			high = Integer.parseInt(tmp.split(" ")[1]);
			
			if (high <= L) sub2 += 1;
			else if (easy <= L) sub1 += 1;
		}
		ans = Math.min(sub2, K) * 140;
		if (sub2 < K) ans += Math.min(K-sub2, sub1) * 100;
		
		System.out.println(ans);
	}
}
