package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThousandsUnitSeparator2016 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringBuilder sb = new StringBuilder(br.readLine()), sb2 = new StringBuilder();
		String tmp = sb.reverse().toString();
		int count = 0;
		
		if (tmp.length() <= 3) {
			System.out.println(sb.reverse());
			return;
		}
		
		for (int i = 0; i < tmp.length(); i++) {
			sb2.append(tmp.charAt(i));
			count++;
			if (count == 3 && i != tmp.length()-1) {
				sb2.append(",");
				count = 0;
			}
		}
		
		System.out.println(sb2.reverse());
	}
}
