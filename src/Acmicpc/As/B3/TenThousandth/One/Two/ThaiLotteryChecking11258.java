package Acmicpc.As.B3.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ThaiLotteryChecking11258 {
	static Map<String, Long> map = new HashMap<>();
	static long check(String num) {
		long price = 0;
		if (map.containsKey(num)) price += map.get(num);
		if (map.containsKey(num.substring(0, 3))) price += map.get(num.substring(0, 3));
		if (map.containsKey(num.substring(3, 6))) price += map.get(num.substring(3, 6));
		if (map.containsKey(num.substring(4, 6))) price += map.get(num.substring(4, 6));
		
		return price;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, num = null;
		long price = 0;
		
		for (int i = 0; i < 6; i++) {
			tmp = br.readLine();
			num = tmp.split(" ")[0];
			price = Long.parseLong(tmp.split(" ")[1]);
			if (!map.containsKey(num)) map.put(num, price);
		}
		
		while (true) {
			num = br.readLine();
			if (num.equals("-1")) break;
			
			sb.append(check(num) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
