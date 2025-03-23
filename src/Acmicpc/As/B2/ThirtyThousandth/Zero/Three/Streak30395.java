package Acmicpc.As.B2.ThirtyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Streak30395 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), P = 0, res = 0, c = 0, f = -2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			P = Integer.parseInt(st.nextToken());
			if (P != 0) c++;
			else if (i-f >= 2) f = i;
			else c = 0;
			res = Math.max(res, c);
		}
		
		System.out.println(res);
		br.close();
	}
}
