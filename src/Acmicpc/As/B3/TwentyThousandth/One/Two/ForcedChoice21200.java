package Acmicpc.As.B3.TwentyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForcedChoice21200 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int P = Integer.parseInt(tmp.split(" ")[1]);
		int S = Integer.parseInt(tmp.split(" ")[2]);
		int m = 0;
		boolean flag = true;
		
		while (S-- > 0) {
			tmp = br.readLine();
			m = Integer.parseInt(tmp.split(" ")[0]);
			flag = true;
			for (int i = 0; i < m; i++) {
				if (Integer.parseInt(tmp.split(" ")[i+1]) == P) {
					sb.append("KEEP\n");
					flag = false;
				}
			}
			if (flag) {
				sb.append("REMOVE\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
