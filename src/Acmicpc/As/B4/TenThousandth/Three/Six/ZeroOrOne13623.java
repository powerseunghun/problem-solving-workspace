package Acmicpc.As.B4.TenThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class ZeroOrOne13623 {
	static Map<Integer, List> map = new HashMap<>();
	static void mapInit() {
		map.put(0, new ArrayList<>());
		map.put(1, new ArrayList<>());
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = null;
		
		mapInit();
		for (int i = 1, val = 0; i <= 3; i++) {
			val = Integer.parseInt(st.nextToken());
			list = map.get(val);
			list.add(i);
			
			map.put(val, list);
		}
		
		for (int i = 0; i < 2; i++) {
			switch(map.get(i).size()) {
			case 1:
				int t = (int) map.get(i).get(0);
				if (t == 1) System.out.println("A");
				else if (t == 2) System.out.println("B");
				else System.out.println("C");
				i = 3;
				break;
			case 3:
				System.out.println("*");
				i = 3;
				return;
			}
		}
		br.close();
	}
}
