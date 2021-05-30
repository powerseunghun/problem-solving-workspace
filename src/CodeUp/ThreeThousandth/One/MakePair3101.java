package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MakePair3101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		Map<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0, first = 0, second = 0; i < N; i++) {
			str = br.readLine();
			if (str.contains("make_pair")) {
				str = str.replaceAll("[a-z]|_| |\\(|\\)", "");
				first = Integer.parseInt(str.split(",")[0]);
				second = Integer.parseInt(str.split(",")[1]);
				map.put("first", first);
				map.put("second", second);
			}
			else {
				System.out.println(map.get(str));
			}
		}
	}
}
