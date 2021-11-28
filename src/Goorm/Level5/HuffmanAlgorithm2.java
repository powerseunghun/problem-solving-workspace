package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class HuffmanAlgorithm2 {
	static Map<String, Character> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null, str = "", res = "";
		int N = Integer.parseInt(br.readLine()), idx = 0;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			map.put(tmp.split(" ")[1], tmp.split(" ")[0].charAt(0));
		}
		tmp = br.readLine();
		
		while (idx < tmp.length()) {
			str += tmp.charAt(idx);
			if (map.containsKey(str)) {
				res += map.get(str);
				str = "";
			}
			idx++;
		}
		System.out.println(res);
		br.close();
	}
}
