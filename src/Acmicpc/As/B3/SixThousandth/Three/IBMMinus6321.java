package Acmicpc.As.B3.SixThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IBMMinus6321 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		for (char c = 'A'; c <= 'Z'; c++) {
			map.put(c, (char)((c+1) >= 91 ? (c+1-26) : (c+1)));  
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), idx = 1;
		
		mapInit();
		while (T-- > 0) {
			tmp = br.readLine();
			sb.append("String #" + (idx++) + "\n");
			for (int i = 0; i < tmp.length(); i++) {
				sb.append(map.get(tmp.charAt(i)));
			}
			sb.append("\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
