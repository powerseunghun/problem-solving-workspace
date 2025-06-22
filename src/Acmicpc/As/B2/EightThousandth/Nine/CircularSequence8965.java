package Acmicpc.As.B2.EightThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularSequence8965 {
	static String func(String str1, String str2) {
		if (str1.compareTo(str2) > 0) return str2;
		else return str1;
	}
	static String func2(String str, int i) {
		return str.substring(i)+str.substring(0,i);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null, res = null;;
		
		while(T-- > 0) {
			str = br.readLine();
			res = str;
			for (int i = 1; i < str.length(); i++) {
				res = func(res, func2(str, i));
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
