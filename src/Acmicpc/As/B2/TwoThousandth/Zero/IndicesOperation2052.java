package Acmicpc.As.B2.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndicesOperation2052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String format = "%." + N + "f";
		System.out.println(String.format(format, Math.pow(0.5, N)));
		
//		String str = Math.pow(2, N*-1) + "";
//		StringBuilder sb = new StringBuilder();
//		
//		if (str.contains("E") ) {
//			idx = str.indexOf('E');
//			e = Integer.parseInt(str.split("E")[1]);
//			for (int i = 0; i < Math.abs(e); i++) {
//				sb.append(i == 0 ? "0." : "0");
//			}
//			sb.append(str.substring(0, idx).replaceAll("\\.", "") + "\n");
//		}
//		else sb.append(str + "\n");
//		System.out.print(sb.toString());
		br.close();
	}
}