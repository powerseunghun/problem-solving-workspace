package Acmicpc.As.B3.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EnoughMultiTab15780 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), e = 0;
		
		for (int i = 0, a = 0; i < K; i++) {
			a = Integer.parseInt(st.nextToken());
			e += a%2 == 0 ? a/2 : a/2+1;
		}
		
		System.out.println(e >= N ? "YES" : "NO");
		br.close();
	}
}
