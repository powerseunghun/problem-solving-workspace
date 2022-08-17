package Acmicpc.As.B3.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleChoice6784 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		String str = null;
		
		for (int i = 0; i < N; i++) {
			sb.append(br.readLine());
		}
		str = sb.toString();
		
		for (int i = 0; i < str.length(); i++) {
			if (br.readLine().equals(str.charAt(i)+"")) cnt++;
		}
		
		
		System.out.println(cnt);
		br.close();
	}
}
