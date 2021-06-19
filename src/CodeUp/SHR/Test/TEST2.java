package CodeUp.SHR.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class TEST2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine(), tStr = null;
		StringBuilder sb = null;
		StringTokenizer st = null;
		Map<Integer, String> map = new HashMap<>();
		boolean flag = false;
		for (int i = 0, num = 1; i < tmp.length(); i++) {
			if (flag) sb.append(tmp.charAt(i));
			if (tmp.charAt(i) == '[') {
				sb = new StringBuilder();
				sb.append(tmp.charAt(i));
				flag = true;
			}
			else if (tmp.charAt(i) == ']') {
				flag = false;
				st = new StringTokenizer(sb.toString(), "[|]| |,");
				while (st.hasMoreTokens()) {
					tStr = st.nextToken();
					if (!map.containsKey(num)) {
						map.put(num++, tStr);
					}
				}
			}
		}
		Set<Integer> tSet = map.keySet();
		Set<String> set = new HashSet<>();
		Iterator iter = tSet.iterator();
		
		while (iter.hasNext()) {
			set.add(map.get(iter.next()));
		}
		
		iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
