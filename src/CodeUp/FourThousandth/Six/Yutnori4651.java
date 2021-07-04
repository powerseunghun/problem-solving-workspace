package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Yutnori4651 {
	static Map<String, Character> map = new HashMap<>();
	static void mapInit() {
		map.put("13", 'A');
		map.put("22", 'B');
		map.put("31", 'C');
		map.put("40", 'D');
		map.put("04", 'E');
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] arr = new int[2];
		
		mapInit();
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			Arrays.fill(arr, 0);
			while (st.hasMoreTokens()) {
				arr[Integer.parseInt(st.nextToken())]++;
			}
			String s = ((arr[0] + "") + (arr[1] + ""));
			System.out.println(map.get(s));
		}
	}
}
