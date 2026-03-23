package Acmicpc.As.B2.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternsAndPictures4527 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), l = 0, S = 0, R = 0, sum = 0;
		String str = null;
		
		while(N-- > 0) {
			l = Integer.parseInt(br.readLine());
			sum = 0;
			for (int i = 0; i < l; i++) {
				str = br.readLine();
				S = Integer.parseInt(str.split(" ")[0]);
				R = Integer.parseInt(str.split(" ")[1]);
				sum += S*R;
			}
			sb.append(36*36/sum).append(" ").append(36*36*2/sum).append(" ").append(36*36*3/sum).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
