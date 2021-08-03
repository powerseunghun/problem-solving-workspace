package Acmicpc.GreedyAlgorithm.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Camping4796 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		int L = 0, P = 0, V = 0, test = 1, count = 0;
		
		while (true) {
			tmp = br.readLine();
			L = Integer.parseInt(tmp.split(" ")[0]);
			P = Integer.parseInt(tmp.split(" ")[1]);
			V = Integer.parseInt(tmp.split(" ")[2]);
			if (L == 0 && P == 0 && V == 0) break;
			count = 0;
			
			count += (V / P) * L;
			count += Math.min(L, V - (V/P)*P);
			
			sb.append("Case " + test++ + ": " + count + "\n");
		}
		System.out.print(sb.toString());
	}
}
