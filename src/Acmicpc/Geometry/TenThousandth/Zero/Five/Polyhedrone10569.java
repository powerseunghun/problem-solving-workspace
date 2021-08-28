package Acmicpc.Geometry.TenThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polyhedrone10569 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0, V = 0, E = 0; i < T; i++) {
			tmp = br.readLine();
			V = Integer.parseInt(tmp.split(" ")[0]);
			E = Integer.parseInt(tmp.split(" ")[1]);
			sb.append((2-V+E) + "\n");
		}
		System.out.print(sb.toString());
	}
}
