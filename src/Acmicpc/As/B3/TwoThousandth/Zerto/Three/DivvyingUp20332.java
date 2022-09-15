package Acmicpc.As.B3.TwoThousandth.Zerto.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivvyingUp20332 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum%3 == 0 ? "yes" : "no");
		br.close();
	}
}
