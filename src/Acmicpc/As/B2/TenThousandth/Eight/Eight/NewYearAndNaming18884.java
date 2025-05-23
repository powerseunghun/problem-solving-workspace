package Acmicpc.As.B2.TenThousandth.Eight.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewYearAndNaming18884 {
	static String[] s = null, t = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		s = br.readLine().split(" ");
		t = br.readLine().split(" ");
		int q = Integer.parseInt(br.readLine()), y = 0;
		
		while(q-- > 0) {
			y = Integer.parseInt(br.readLine())-1;
			sb.append(s[y%n]).append(t[y%m]).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
