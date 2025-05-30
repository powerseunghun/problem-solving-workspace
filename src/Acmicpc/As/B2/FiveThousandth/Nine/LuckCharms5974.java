package Acmicpc.As.B2.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckCharms5974 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int L = Integer.parseInt(str.split(" ")[0]);
		int C = Integer.parseInt(str.split(" ")[1]);
		int N = Integer.parseInt(str.split(" ")[2]), S = 0, P = 0;
		
		while(C-- > 0) {
			str = br.readLine();
			S = Integer.parseInt(str.split(" ")[0]);
			P = Integer.parseInt(str.split(" ")[1]);
			sb.append(S+Math.abs(P-N)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
