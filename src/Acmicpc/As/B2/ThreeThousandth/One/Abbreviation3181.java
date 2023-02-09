package Acmicpc.As.B2.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Abbreviation3181 {
	static Set<String> set = new HashSet<>(Arrays.asList("i", "pa", "te", "ni" ,"niti", "a", "ali", "nego", "no", "ili"));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String tmp = null;
		
		for (int i = 0; st.hasMoreTokens(); i++) {
			tmp = st.nextToken();
			if (set.contains(tmp)) {
				if (i == 0) {
					sb.append((char)(tmp.charAt(0)-32));
				}
				continue;
			}
			sb.append((char)(tmp.charAt(0)-32));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
