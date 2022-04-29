package Codeforce.OrderSubmit.OneThousandth.OneHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RegistrationSystem {
	static Map<String, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String str = null;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			if (!map.containsKey(str)) {
				sb.append("OK\n");
				map.put(str, 1);
			}
			else {
				sb.append(str + map.get(str) + "\n");
				map.put(str, map.get(str)+1);
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
