package Acmicpc.As.B4.TenThousandth.Eight.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HOMWRK18398 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 0, A = 0, B = 0;
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		while (T-- > 0) {
			N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				tmp = br.readLine();
				A = Integer.parseInt(tmp.split(" ")[0]);
				B = Integer.parseInt(tmp.split(" ")[1]);
				sb.append((A+B) + " " + (A*B) + "\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
