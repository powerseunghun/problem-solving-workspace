package Acmicpc.As.B3.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zegarek26752 {
	static int[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = 0, w = 2;
		
		while (st.hasMoreTokens()) {
			t += Math.pow(60, w--) * Integer.parseInt(st.nextToken());
		}
		t++;
		
//		System.out.println(t / 3600);
//		System.out.println((t-((t/3600)*3600)) / 60);
//		System.out.println(t % 60);
		System.out.println(String.format("%02d:%02d:%02d", t/3600==24 ? 0 : t/3600, (t-((t/3600)*3600)) / 60, t%60));
		br.close();
	}
}
