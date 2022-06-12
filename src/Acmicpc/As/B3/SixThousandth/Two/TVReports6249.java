package Acmicpc.As.B3.SixThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TVReports6249 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int p = Integer.parseInt(tmp.split(" ")[1]);
		int h = Integer.parseInt(tmp.split(" ")[2]), d = 0;
		
		for (int i = 0; i < n; i++) {
			d = Integer.parseInt(br.readLine());
			if (p > d) {
				sb.append("NTV: Dollar dropped by " + (p-d) + " Oshloobs\n");
			}
			if (h < d) {
				sb.append("BBTV: Dollar reached " + d + " Oshloobs, A record!\n");
			}
			p = d;
			h = Math.max(h, d);
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
