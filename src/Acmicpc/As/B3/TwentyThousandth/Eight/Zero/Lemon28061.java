package Acmicpc.As.B3.TwentyThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lemon28061 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE, v = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			max = Math.max(Math.max(v-(N--), 0), max);
		}
		
		System.out.println(max);
		br.close();
	}
}
