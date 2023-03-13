package Acmicpc.As.B2.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GadgetPurchases5155 {
	static int[] arr = null, limit = null;
	static int[] use = null, cost = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), n = 0, c = 0, u = 0, r = 0;
		int a = 0, b = 0;
		String tmp = null;
		
		for (int i = 1; i <= K; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[b];
			limit = new int[b];
			use = new int[b];
			cost = new int[b];
			
			sb.append("Data Set ").append(i).append(":").append("\n");
			for (int j = 0; j < b; j++) {
				tmp = br.readLine();
				n = Integer.parseInt(tmp.split(" ")[0]);
				c = Integer.parseInt(tmp.split(" ")[1]);
				u = Integer.parseInt(tmp.split(" ")[2]);
				r = Integer.parseInt(tmp.split(" ")[3]);
				arr[j] = r-c;
				limit[j] = u;
				cost[j] = n;
			}
			
			for (int j = 0, p = 0; j < a; j++) {
				p = Integer.parseInt(br.readLine())-1;
				use[p]++;
				if (use[p] > limit[p]) use[p] = limit[p];
			}
			for (int j = 0; j < use.length; j++) {
				if (use[j] * arr[j] > cost[j]) sb.append(j+1).append("\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
