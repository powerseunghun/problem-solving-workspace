package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KonigsbergBridge2045 {
	public static void main(String[] args) throws IOException {
		Map<Integer, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Set<Integer> bge = new HashSet<>();
		boolean check1 = true, check2 = false;
		int evenCnt = 0;
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		if (n-1 > m) {
			System.out.println("NO");
			return;
		}
		int a = 0, b = 0;
		
		for (int i = 0; i < m; i++) {
			tmp = br.readLine();
			for (int j = 0; j <= 1; j++) {
				int t = Integer.parseInt(tmp.split(" ")[j]);
				if (!map.containsKey(t)) map.put(t, 1);
				else map.put(t, map.get(t)+1);
				bge.add(t);
			}
		}
		if (bge.size() < n) {
			System.out.println("NO");
			return;
		}
		Iterator<Integer> iter = bge.iterator();
		while(iter.hasNext()) {
			int iVal = iter.next();
			if (map.get(iVal) % 2 != 0) {
				evenCnt++;
				check1 = false;
			}
		}
		if (evenCnt == 2) check2 = true;
		
		if (check1 || check2) System.out.println("YES");
		else System.out.println("NO");
	}
}
