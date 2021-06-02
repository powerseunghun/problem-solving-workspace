package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReplaceImpl3125 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ']') {
				int j = i, count = 0;
				for (; sb.charAt(j) != '['; j--, count++) {
					sb.deleteCharAt(j);
				}
				sb.deleteCharAt(j);
				i -= (count + 1);
			}
		}
		System.out.println(sb);
	}
}
