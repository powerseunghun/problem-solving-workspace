package Acmicpc.As.B3.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 文字列の反転18412 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), sb2 = new StringBuilder();
		String tmp = br.readLine(), str = null;;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int A = Integer.parseInt(tmp.split(" ")[1]);
		int B = Integer.parseInt(tmp.split(" ")[2]);
		str = br.readLine();
		
		String s1 = str.substring(0, A-1);
		String s2 = str.substring(A-1, B);
		sb2.append(s2);
		String s3 = str.substring(B, str.length());
		
		sb.append(s1);
		sb.append(sb2.reverse().toString());
		sb.append(s3);
		
		System.out.println(sb.toString());
		br.close();
	}
}
