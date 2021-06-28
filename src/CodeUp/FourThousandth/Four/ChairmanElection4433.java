package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ChairmanElection4433 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<Integer, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), p1 = 0, p2 = 0;
		int minVal = n, personCount = 0;
		
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			p1 = Integer.parseInt(tmp.split(" ")[0]);
			p2 = Integer.parseInt(tmp.split(" ")[1]);
			if (p1 == -1 && p2 == -1) break;
			
			if (!map.containsKey(p1)) map.put(p1, n-1);
			else map.put(p1, map.get(p1)-1);
			if (!map.containsKey(p2)) map.put(p2, n-1);
			else map.put(p2, map.get(p2)-1);
		}
		
		for (int i = 1; i <= n; i++) {
			minVal = minVal >= map.get(i) ? map.get(i) : minVal;
		}
		
		for (int i = 1; i <= n; i++) {
			if (map.get(i) == minVal) {
				personCount++;
			}
		}
		
		System.out.println(minVal + " " + personCount);
		
		for (int i = 1; i <= n; i++) {
			if (map.get(i) == minVal) {
				System.out.print(i + " ");
			}
		}
	}
}
