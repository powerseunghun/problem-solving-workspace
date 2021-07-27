package Acmicpc.String.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinkyunPassword9933 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		StringBuilder sb = null;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			map.put(tmp, 1);
		}
		
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			sb = new StringBuilder(iter.next().toString());
			if (map.containsKey(sb.toString()) && map.containsKey(sb.reverse().toString())) {
				tmp = sb.toString();
				System.out.println(tmp.length() + " " + tmp.charAt(tmp.length()/2));
				return;
			}
		}
	}
}
