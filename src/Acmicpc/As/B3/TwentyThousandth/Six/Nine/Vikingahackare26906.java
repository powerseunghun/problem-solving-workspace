package Acmicpc.As.B3.TwentyThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Vikingahackare26906 {
	static Map<String, Character> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null, k = null;
		char v = ' ';
		
		while(T-- > 0) {
			str = br.readLine();
			v = str.split(" ")[0].charAt(0);
			k = str.split(" ")[1];
			if (!map.containsKey(k)) {
				map.put(k, v);
			}
		}
		str = br.readLine();
		for (int i = 0; i < str.length(); i+=4) {
			sb.append(map.containsKey(str.substring(i, i+4)) ? map.get(str.substring(i, i+4)) : "?");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
