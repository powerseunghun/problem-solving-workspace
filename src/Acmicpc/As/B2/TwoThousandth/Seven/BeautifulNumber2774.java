package Acmicpc.As.B2.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BeautifulNumber2774 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			set.clear();
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				set.add(str.charAt(i));
			}
			sb.append(set.size() + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
