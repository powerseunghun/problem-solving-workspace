package Acmicpc.As.B3.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeoulMetro32777 {
	static final int station = 43;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine()), a = 0, b = 0, i = 0, o = 0;
		String str = null;
		
		while(Q-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			i = (b-a+station) % station;
			o = (a-b+station) % station;
			
			sb.append(o > i ? "Inner circle line" : i > o ? "Outer circle line" : "Same").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
