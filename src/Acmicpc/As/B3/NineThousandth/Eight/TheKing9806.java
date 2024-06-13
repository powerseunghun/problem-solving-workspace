package Acmicpc.As.B3.NineThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheKing9806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		br.readLine();
		int P = Integer.parseInt(br.readLine()), M = 0, X = 0, res = 0;
		
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			M = Integer.parseInt(st.nextToken());
			X = 1;
			for (int i = 0; i < P; i++) {
				X *= M;
			}
			res += X > 0 ? X : 0;
		}
		
		System.out.println(res);
		br.close();
	}
}
