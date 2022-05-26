package Codeforce.OrderSubmit.TwoThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimalSquare {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String tmp = null;
		
		while(t-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			
			sb.append((Math.max(Math.min(a, b)*2, Math.max(a, b)) * Math.max(Math.min(a, b)*2, Math.max(a, b))) + "\n");
//			sb.append((Math.max(a, b) * (Math.min(a, b) * 2)) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
