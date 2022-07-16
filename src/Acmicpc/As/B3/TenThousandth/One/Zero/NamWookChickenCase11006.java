package Acmicpc.As.B3.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NamWookChickenCase11006 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		int a = 0, b = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			
			a = M*2-N;
			b = (N-a) / 2;
			sb.append(a + " " + b + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
