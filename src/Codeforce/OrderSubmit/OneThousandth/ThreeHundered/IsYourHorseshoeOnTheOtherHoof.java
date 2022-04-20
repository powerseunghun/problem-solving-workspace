package Codeforce.OrderSubmit.OneThousandth.ThreeHundered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class IsYourHorseshoeOnTheOtherHoof {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0, val = 0;
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (!map.containsKey(val)) {
				map.put(val, 1);
			}
			else count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
