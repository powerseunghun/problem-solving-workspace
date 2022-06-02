package Acmicpc.As.B3.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillingOutTheTeam4758 {
	static StringBuilder sb = new StringBuilder();
	static double[] baseSpeed = { 4.5, 6.0, 5.0 };
	static int[] baseWeight = { 150, 300, 200 };
	static int[] baseStrength = { 200, 500, 300 };
	static String[] strs = { "Wide Receiver", "Lineman", "Quarterback" };
	static void func(double s, int w, int st) {
		int count = 0;
		for (int i = 0; i < strs.length; i++) {
			if (baseSpeed[i] >= s && baseWeight[i] <= w && baseStrength[i] <= st) {
				if (count != 0) sb.append(" ");  
				sb.append(strs[i]);
				count++;
			}
		}
		sb.append(count == 0 ? "No positions\n" : "\n");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		double s = 0;
		int w = 0, st = 0;
		
		while (true) {
			tmp = br.readLine();
			s = Double.parseDouble(tmp.split(" ")[0]);
			w = Integer.parseInt(tmp.split(" ")[1]);
			st = Integer.parseInt(tmp.split(" ")[2]);
			if (s == 0 && w == 0 && st == 0) break;
			func(s, w, st);
		}
		System.out.print(sb.toString());
		br.close();
	}
}
