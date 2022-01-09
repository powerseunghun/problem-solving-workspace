package Goorm.AlgorithmHeroes.T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeedElemination {
	static void reCalc(int[] weed, int c, int a, int b) {
		for (int i = a; i < weed.length; i++) {
			weed[i] += (c == 2 ? b : b*-1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int q = Integer.parseInt(tmp.split(" ")[1]);
		int[] weed = new int[N+1];
		tmp = br.readLine();
		
		for (int i = 1; i < weed.length; i++) {
			weed[i] = Integer.parseInt(tmp.split(" ")[i-1]);
			weed[i] += weed[i-1];
		}
		
		for (int i = 0, c = 0, a = 0, b = 0; i < q; i++) {
			tmp = br.readLine();
			c = Integer.parseInt(tmp.split(" ")[0]);
			a = Integer.parseInt(tmp.split(" ")[1]);
			b = Integer.parseInt(tmp.split(" ")[2]);
			
			if (c == 1) {
				sb.append((weed[b]-weed[a-1]) + "\n");
				continue;
			}
			reCalc(weed, c, a, b);
		}
		System.out.print(sb.toString());
	}
}
