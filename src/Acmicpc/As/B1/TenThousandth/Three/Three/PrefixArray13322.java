package Acmicpc.As.B1.TenThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrefixArray13322 {
	static Map<String, Integer> map = new HashMap<>();
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
//		for (int i = 1; i <= str.length(); i++) {
//			subs = str.substring(0, i);
//			list.add(subs);
//			map.put(subs, i-1);
//		}
//		Collections.sort(list);
//		
//		for (String s : list) {
//			sb.append(map.get(s)).append("\n");
//		}
		for (int i = 0; i < str.length(); i++) {
			sb.append(i).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
