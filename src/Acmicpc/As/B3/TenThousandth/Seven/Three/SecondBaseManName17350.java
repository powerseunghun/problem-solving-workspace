package Acmicpc.As.B3.TenThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondBaseManName17350 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		while (N-- > 0) {
			tmp = br.readLine();
			if (tmp.equals("anj")) {
				sb.append("뭐야;\n");
				break;
			}
		}
		
		System.out.print(sb.toString().equals("") ? "뭐야?\n" : sb.toString());
		br.close();
	}
}
