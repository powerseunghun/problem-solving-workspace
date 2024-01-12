package Acmicpc.As.S5.TwentyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synocopation21966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		boolean flag = true;
		
		if (N <= 25) {
			sb.append(str);
		}
		else {
			String subStr = str.substring(12, str.length()-12);
			for (char ch : subStr.toCharArray()) {
				if (ch == '.') {
					flag = false;
					break;
				}
			}
			sb.append(flag ? str.substring(0,11) + "..." + str.substring(str.length()-11) 
			: str.substring(0,9) + "......" + str.substring(str.length()-10));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
