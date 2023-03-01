package Acmicpc.As.B2.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IDKey9773 {
	static int getSum(String tmp) {
		int sum = 0;
		for (int i = 0; i < tmp.length(); i++) {
			sum += tmp.charAt(i)-'0';
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), w = 0;
		String tmp = null;
		
		while (N-- > 0) {
			tmp = br.readLine();
			w = Integer.parseInt(tmp.substring(tmp.length()-3, tmp.length())) * 10;
			w += getSum(tmp);
			sb.append(w < 1000 ? w+1000 : (w+"").substring((w+"").length()-4, (w+"").length())).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
