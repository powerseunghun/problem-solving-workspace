package SWExpertAcademy.D3.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven5549 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			tmp = (tmp.charAt(tmp.length()-1)-'0') % 2 == 0 ? "Even\n" : "Odd\n";
			sb.append("#" + i + " " + tmp);
		}
		System.out.print(sb.toString());
	}
}
