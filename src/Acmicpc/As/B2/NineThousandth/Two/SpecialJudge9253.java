package Acmicpc.As.B2.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialJudge9253 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		String u = br.readLine();
		
		System.out.println(A.contains(u) && B.contains(u) ? "YES" : "NO");
		br.close();
	}
}
