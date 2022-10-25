package Acmicpc.As.B4.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricBill25881 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int k = Integer.parseInt(br.readLine()), m = 0, d = 0;
		
		while (k-- > 0) {
			m = Integer.parseInt(br.readLine());
			d = m <= 1000 ? a * m : (a * 1000) + ((m-1000) * b);
			sb.append(m + " " + d + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
