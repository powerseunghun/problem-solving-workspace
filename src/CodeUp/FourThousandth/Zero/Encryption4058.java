package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryption4058 {
	static String getComplement(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') sb.append("1");
			else sb.append("0");
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		String tmp = sb.reverse().toString();
		
		for (int i = 0; i < tmp.length(); i++) {
			String v = getComplement(Integer.toBinaryString((int)tmp.charAt(i)));
			System.out.println(v);
		}
	}
}
