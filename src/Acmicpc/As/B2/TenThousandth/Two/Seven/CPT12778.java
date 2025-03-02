package Acmicpc.As.B2.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CPT12778 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine().split(" ")[1];
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens()) {
				if (str.equals("C")) {
					sb.append(st.nextToken().charAt(0) - 64);
				} else {
					sb.append((char)(Integer.parseInt(st.nextToken())+64));
				}
				if (st.hasMoreTokens()) sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
