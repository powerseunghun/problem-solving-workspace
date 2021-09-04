package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCompression1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null, ans = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		char c = ' ';
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			ans = "";
			for (int j = 0, l = 0; j < N; j++) {
				tmp = br.readLine();
				c = tmp.split(" ")[0].charAt(0);
				l = Integer.parseInt(tmp.split(" ")[1]);
				for (int k = 0; k < l; k++) {
					ans += c;
				}
			}
			sb.append("#" + i + "\n");
			for (int j = 0; j < ans.length(); j++) {
				if (j % 10 == 0 && j != 0) sb.append("\n");
				sb.append(ans.charAt(j));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
