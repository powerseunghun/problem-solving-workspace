package Acmicpc.As.B3.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AndThenThereWas11520 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), v = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			v = Integer.parseInt(str.split(" ")[1]);
			sb.append(v + " 5").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
