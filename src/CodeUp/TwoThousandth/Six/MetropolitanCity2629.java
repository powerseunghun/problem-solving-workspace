package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MetropolitanCity2629 {
	static double getDist(int x, int y) {
		return Math.sqrt(((0-x)*(0-x)) + ((0-y)*(0-y)));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Double, Integer> map = new HashMap<>();
		Set<Double> tDist = new HashSet<>();
		ArrayList<Double> dist = null;
		
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int P = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			double val = getDist(Integer.parseInt(tmp.split(" ")[0]), Integer.parseInt(tmp.split(" ")[1]));
			int pop = Integer.parseInt(tmp.split(" ")[2]);
			tDist.add(val);
			if (!map.containsKey(val)) {
				map.put(val, pop);
			}
			else map.put(val, map.get(val)+pop);
		}
		dist = new ArrayList<Double>(tDist);
		Collections.sort(dist);
		
		for (int i = 0; i < dist.size(); i++) {
			P += map.get(dist.get(i));
			if (P >= 1000000) {
				System.out.printf("%.3f", dist.get(i));
				return;
			}
		}
		System.out.println("-1");
	}
}
