package Acmicpc.As.B4.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircadianRhythm34400 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), t = 0;
		
		while(T-- > 0) {
			t = Integer.parseInt(br.readLine());
			sb.append(t%25 < 17 ? "ONLINE" : "OFFLINE").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
