package Acmicpc.OrderSubmit.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NotationChange11005 {
	static Map<Integer, Character> map = new HashMap<>();
	static void mapInit() {
		int value = 0;
		for (char c = '0'; c <= '9'; c++) {
			map.put(value++, c);
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			map.put(value++, c);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		mapInit();
		
		while (N != 0) {
			sb.append(map.get(N%B));
			N /= B;
		}
		
		System.out.println(sb.reverse().toString());
		br.close();
	}
}
