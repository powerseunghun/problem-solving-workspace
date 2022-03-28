package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RepresentativeValue2592 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, max = 0, maxVal = 0;
		
		for (int i = 0, val = 0; i < 10; i++) {
			val = Integer.parseInt(br.readLine());
			sum += val;
			if (!map.containsKey(val)) map.put(val, 1);
			else map.put(val, map.get(val)+1);
			if (map.get(val) > max) {
				max = map.get(val);
				maxVal = val;
			}
		}
		
		System.out.println(sum / 10);
		System.out.println(maxVal);
	}
}
