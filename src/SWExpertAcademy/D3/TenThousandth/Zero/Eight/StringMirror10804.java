package SWExpertAcademy.D3.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringMirror10804 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		map.put('p', 'q'); map.put('q', 'p');
		map.put('b', 'd'); map.put('d', 'b');
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		mapInit();
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			sb.append("#" + i + " ");
			for (int j = tmp.length()-1; j >= 0; j--) {
				sb.append(map.get(tmp.charAt(j)));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
