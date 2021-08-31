package SWExpertAcademy.D2.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PatterLength2007 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		Map<Character, Integer> map = new HashMap<>();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1, count = 0; i <= T; i++, count = 0) {
			map.clear();
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				if (map.containsKey(tmp.charAt(j))) break;
				else {
					map.put(tmp.charAt(j), 1);
					count++;
				}
			}
			sb.append("#" + i + " " + count + "\n");
		}
		System.out.print(sb.toString());
	}
}
