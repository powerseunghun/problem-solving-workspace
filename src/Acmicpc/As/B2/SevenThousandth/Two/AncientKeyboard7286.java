package Acmicpc.As.B2.SevenThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AncientKeyboard7286 {
	static Map<Integer, Integer> map = new HashMap<>();
	static final int w = 64;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int n = 0, a = 0, b = 0;
		String str = null;
		
		while(t-- > 0) {
			n = Integer.parseInt(br.readLine());
			map.clear();
			while(n-- > 0) {
				str = br.readLine();
				a = Integer.parseInt(str.split(" ")[1]);
				b = Integer.parseInt(str.split(" ")[2]);
				
				for (int i = a; i < b; i++) {
					map.put(i, map.getOrDefault(i, 0)+1);
				}
			}
			
			for (int key : map.keySet()) {
				int v = map.get(key);
				sb.append((char)(v+w));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
