package Acmicpc.As.B3.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheREALManhattanDistance13228 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), dist = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			dist = 0;
			dist += Integer.parseInt(tmp.split(" ")[2]) + Integer.parseInt(tmp.split(" ")[5]);
			dist += Math.abs(Integer.parseInt(tmp.split(" ")[0]) - Integer.parseInt(tmp.split(" ")[3]));
			dist += Math.abs(Integer.parseInt(tmp.split(" ")[1]) - Integer.parseInt(tmp.split(" ")[4]));
			sb.append(dist + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
