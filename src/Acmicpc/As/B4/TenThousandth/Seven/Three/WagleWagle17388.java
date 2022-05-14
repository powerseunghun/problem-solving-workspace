package Acmicpc.As.B4.TenThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WagleWagle17388 {
	static Map<Integer, String> map = new HashMap<>();
	static String[] strs = {"Soongsil", "Korea", "Hanyang"};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE, sum = 0;;
		
		for (int i = 0, val = 0; i < strs.length; i++) {
			val = Integer.parseInt(st.nextToken());
			sum += val;
			map.put(val, strs[i]);
			min = Math.min(val, min);
		}
		
		if (sum >= 100) {
			System.out.println("OK");
			return;
		}
		
		System.out.println(map.get(min));
		br.close();
	}
}
