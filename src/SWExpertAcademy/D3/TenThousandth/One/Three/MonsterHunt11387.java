package SWExpertAcademy.D3.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonsterHunt11387 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		long D = 0, L = 0, N = 0, total = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			D = Long.parseLong(tmp.split(" ")[0]);
			L = Long.parseLong(tmp.split(" ")[1]);
			N = Long.parseLong(tmp.split(" ")[2]);
			total = (D*N) + (D*L*N * (N-1)) / 200;
			sb.append("#" + i + " " + total + "\n");
		}
		System.out.print(sb.toString());
	}
}
