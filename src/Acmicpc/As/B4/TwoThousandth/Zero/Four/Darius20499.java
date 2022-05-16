package Acmicpc.As.B4.TwoThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Darius20499 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "/");
		int K = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		
		if (D == 0 || K+A < D) System.out.println("hasu");
		else System.out.println("gosu");
		
		br.close();
	}
}
