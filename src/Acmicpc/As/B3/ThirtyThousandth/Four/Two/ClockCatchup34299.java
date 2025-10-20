package Acmicpc.As.B3.ThirtyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClockCatchup34299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h1 = Integer.parseInt(str.split(":")[0]);
		int m1 = Integer.parseInt(str.split(":")[1]);
		int s1 = Integer.parseInt(str.split(":")[2]);
		str = br.readLine();
		int h2 = Integer.parseInt(str.split(":")[0]);
		int m2 = Integer.parseInt(str.split(":")[1]);
		int s2 = Integer.parseInt(str.split(":")[2]);
		int t = h2-h1;
		
		System.out.print((h1<12&&h2>=12) ? "1 " : "0 ");
		System.out.println(t + " " + (t*60+m2-m1));
		br.close();
	}
}
