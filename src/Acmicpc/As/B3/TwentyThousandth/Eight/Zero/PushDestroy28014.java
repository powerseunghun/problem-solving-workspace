package Acmicpc.As.B3.TwentyThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PushDestroy28014 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p = 0, w = 0, res = 0;
		
		while (st.hasMoreTokens()) {
			w = Integer.parseInt(st.nextToken());
			if (w >= p) res++;
			p = w;
		}
		
		System.out.println(res);
		br.close();
	}
}
