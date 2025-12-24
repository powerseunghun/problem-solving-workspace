package Acmicpc.As.B4.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissedAlarm34796 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h1 = Integer.parseInt(str.split(":")[0]);
		int m1 = Integer.parseInt(str.split(":")[1]);
		str = br.readLine();
		int h2 = Integer.parseInt(str.split(":")[0]);
		int m2 = Integer.parseInt(str.split(":")[1]);
		
		System.out.println(h1*60+m1 < h2*60+m2 ? "YES" : "NO");
		br.close();
	}
}
