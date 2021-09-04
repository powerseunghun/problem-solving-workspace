package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DateCalculator1948 {
	static void mapInit(Map<Integer, Integer> map) {
		map.put(1, 31); map.put(2, 28); map.put(3, 31); map.put(4, 30);
		map.put(5, 31); map.put(6, 30); map.put(7, 31); map.put(8, 31);
		map.put(9, 30); map.put(10, 31); map.put(11, 30); map.put(12, 31);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		Map<Integer, Integer> map = new HashMap<>();
		mapInit(map);
		int T = Integer.parseInt(br.readLine()), m1 = 0, d1 = 0, m2 = 0, d2 = 0;
		int sum = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			m1 = Integer.parseInt(tmp.split(" ")[0]);
			d1 = Integer.parseInt(tmp.split(" ")[1]);
			m2 = Integer.parseInt(tmp.split(" ")[2]);
			d2 = Integer.parseInt(tmp.split(" ")[3]);
			if (m1 == m2) {
				sb.append("#" + i + " " + (d2 - d1 + 1) + "\n");
			}
			else {
				sum = map.get(m1)-d1;
				for (int j = m1+1; j < m2; j++) {
					sum += map.get(j);
				}
				sum += d2+1;
				sb.append("#" + i + " " + sum + "\n");
			}
		}
		System.out.print(sb.toString());
	}
}
