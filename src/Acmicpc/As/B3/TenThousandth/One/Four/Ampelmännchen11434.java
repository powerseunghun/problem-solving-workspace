package Acmicpc.As.B3.TenThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ampelmännchen11434 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());
		int n = 0, W = 0, E = 0;
		int lww = 0, lwe = 0, lew = 0, lee = 0, res = 0;
		String str = null;
		
		for (int i = 1; i <= K; i++) {
			res = 0;
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			W = Integer.parseInt(str.split(" ")[1]);
			E = Integer.parseInt(str.split(" ")[2]);
			
			while(n-- > 0) {
				str = br.readLine();
				lww = Integer.parseInt(str.split(" ")[0]);
				lwe = Integer.parseInt(str.split(" ")[1]);
				lew = Integer.parseInt(str.split(" ")[2]);
				lee = Integer.parseInt(str.split(" ")[3]);
				res += Math.max(lww*W+lew*E, lwe*W+lee*E);
			}
			sb.append("Data Set ").append(i).append(":\n");
			sb.append(res).append("\n").append(i != K ? "\n" : "");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
