package SWExpertAcademy.D3.EightThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WriteErase8821 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), cnt = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			cnt = 0;
			map.clear();
			for (int j = 0; j <  tmp.length(); j++) {
				if (!map.containsKey(tmp.charAt(j))) {
					map.put(tmp.charAt(j), 1);
					cnt++;
				}
				else {
					map.remove(tmp.charAt(j));
					cnt--;
				}
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
