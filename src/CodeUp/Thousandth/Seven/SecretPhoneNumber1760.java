package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SecretPhoneNumber1760 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<>();
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (!map.containsKey(tmp.charAt(i))) {
				map.put(tmp.charAt(i), i);
			}
		}
		tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == ' ') System.out.print(" ");
			else System.out.print(map.get(tmp.charAt(i)));
		}
		
	}
}
