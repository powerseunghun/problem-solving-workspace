package Acmicpc.As.B4.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeIntegers18408 {
	static int[] cnts = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			cnts[Integer.parseInt(st.nextToken())]++;
		}
		
		if (cnts[1] > cnts[2]) System.out.println("1");
		else System.out.println("2");
		
		br.close();
	}
}
