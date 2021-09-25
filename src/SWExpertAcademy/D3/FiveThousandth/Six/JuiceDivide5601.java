package SWExpertAcademy.D3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JuiceDivide5601 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			sb.append("#" + i + " ");
			for (int j = 0; j < N; j++) {
				sb.append("1/" + N + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
