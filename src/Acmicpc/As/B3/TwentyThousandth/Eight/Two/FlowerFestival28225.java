package Acmicpc.As.B3.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowerFestival28225 {
	static Map<Double, Integer> map = new HashMap<>();
	static List<Double> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int f = Integer.parseInt(str.split(" ")[1]);
		double x = 0, v = 0, t = 0;
		
		for (int i = 1; i <= n; i++) {
			str = br.readLine();
			x = Double.parseDouble(str.split(" ")[0]);
			v = Double.parseDouble(str.split(" ")[1]);
			t = (f-x)/v;
			map.put(t, i);
			list.add(t);
		}
		Collections.sort(list);
		
		System.out.println(map.get(list.get(0)));
		br.close();
	}
}
