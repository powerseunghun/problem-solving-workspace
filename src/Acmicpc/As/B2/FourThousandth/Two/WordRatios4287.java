package Acmicpc.As.B2.FourThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordRatios4287 {
	static void func(String[] strs, StringBuilder sb) {
		String s = strs[0], t = strs[1], nt = strs[2];
		for (int i = 0, w = 0; i < s.length(); i++) {
			w = (int)(t.charAt(i) - s.charAt(i));
			w = w < 0 ? w+26 : w;
			w += nt.charAt(i);
			w = w > 122 ? w-26 : w;
			sb.append((char)w);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		String[] strs = null;
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("#")) break;
			sb.append(tmp + " ");
			strs = tmp.split(" ");
			func(strs, sb);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
