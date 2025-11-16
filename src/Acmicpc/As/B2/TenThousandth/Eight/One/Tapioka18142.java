package Acmicpc.As.B2.TenThousandth.Eight.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tapioka18142 {
	static final int l = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = null;
		boolean flag = false;
		
		while (st.hasMoreTokens()) {
			str = st.nextToken();
			if (str.equals("bubble") || str.equals("tapioka")) continue;
			sb.append(str).append(" ");
			flag = true;
		}
		
		System.out.println(!flag ? "nothing" : sb.toString());
		br.close();
	}
}
