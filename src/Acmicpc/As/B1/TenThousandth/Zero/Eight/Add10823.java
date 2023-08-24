package Acmicpc.As.B1.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Add10823 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String str = null;
		long res = 0;
		
		while((str = br.readLine()) != null) {
			sb.append(br.readLine());
		}
		
		st = new StringTokenizer(sb.toString(), ",");
		
		while (st.hasMoreTokens()) {
			res += Long.parseLong(st.nextToken());
		}
		
		System.out.println(res);
		br.close();
	}
}
