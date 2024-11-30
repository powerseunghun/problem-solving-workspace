package Acmicpc.As.B3.ThirtyThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PiqueEsconde30655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		Map<Integer, Boolean> map = new HashMap<>();
		int n = 0, m = 0;
		
		while(true) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			m = Integer.parseInt(str.split(" ")[1]);
			if (n == 0 && m == 0) break;
			map.clear();
			map.put(m, true);
			
			for (int i = 0, v = 0; i < n-2; i++) {
				v = Integer.parseInt(br.readLine());
				map.put(v, true);
			}
			
			for (int i = 1; i <= n; i++) {
				if (!map.containsKey(i)) {
					sb.append(i).append("\n");
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
