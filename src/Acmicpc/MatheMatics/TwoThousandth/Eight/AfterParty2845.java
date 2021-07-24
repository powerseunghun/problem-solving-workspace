package Acmicpc.MatheMatics.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AfterParty2845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int L = Integer.parseInt(tmp.split(" ")[0]);
		int P = Integer.parseInt(tmp.split(" ")[1]);
		int base = L * P, val = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			System.out.print((val - base) +  " ");
		}
	}
}
