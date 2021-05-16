package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AcidityMeasurement2021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), idx = 0;
		int max1 = 0, max2 = 0;
		String sensor1 = "", sensor2 = "0";
		for (int i = 0; i < n; i++) {
			String key = br.readLine();
			if (!map.containsKey(key)) {
				map.put(key, 1);
			}
			else map.put(key, map.get(key)+1);
		}
		int[] counts = new int[map.keySet().size()];
		Iterator iter = map.keySet().iterator();
		while(iter.hasNext()) {
			counts[idx++] = map.get(iter.next());
		}
		Arrays.sort(counts);
		max1 = counts[counts.length-1];
		max2 = counts[counts.length-2];
		
		iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String tmp = iter.next() + "";
			if (map.get(tmp) == max1) {
				sensor1 = tmp;
			}
		}
		iter = map.keySet().iterator();
		sensor2 = sensor1.toString();
		while (iter.hasNext()) {
			String tmp = iter.next() + "";
			if (map.get(tmp) == max2) {
				int t1 = Math.abs(Integer.parseInt(sensor1) - Integer.parseInt(tmp));
				int t2 = Math.abs(Integer.parseInt(sensor1) - Integer.parseInt(sensor2));
				if (t1 > t2) sensor2 = tmp;
			}
		}
		System.out.println(Math.abs(Integer.parseInt(sensor1) - Integer.parseInt(sensor2)));
	}
}
