package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AlphabetCount1412 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (!(tmp.charAt(i) >= 'a' && tmp.charAt(i) <= 'z')) continue;
			if (!map.containsKey((int)tmp.charAt(i))) {
				map.put((int)tmp.charAt(i), 1);
			}
			else map.put((int)tmp.charAt(i), map.get((int)tmp.charAt(i)) + 1);
		}
		
		for (int i = 97; i <= 122; i++) {
			if (!map.containsKey(i)) System.out.println((char)i + ":0");
			else System.out.println((char)i + ":" + map.get(i));
		}
	}
}
