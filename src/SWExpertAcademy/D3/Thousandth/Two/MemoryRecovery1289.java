package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemoryRecovery1289 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int T = Integer.parseInt(br.readLine()), cnt = 0;
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			cnt = str.charAt(0) - '0';
			for (int j = 0; j < str.length()-1; j++) {
				if (str.charAt(j) != str.charAt(j+1)) cnt++;
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
