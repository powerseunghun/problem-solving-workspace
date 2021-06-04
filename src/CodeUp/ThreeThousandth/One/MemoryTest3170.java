package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemoryTest3170 {
	public static void main(String[] args) throws IOException {
		Map<String, Integer> list = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), m = Integer.parseInt(tmp.split(" ")[1]), num = 0;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			num = Integer.parseInt(tmp.split(" ")[1]);
			tmp = tmp.split(" ")[0];
			if (!list.containsKey(tmp)) {
				list.put(tmp, num);
			}
			else {
				list.put(tmp, list.get(tmp) + num);
			}
		}
		
		for (int i = 0; i < m; i++) {
			tmp = br.readLine();
			if (!list.containsKey(tmp)) {
				System.out.println(0);
			}
			else {
				System.out.println(list.get(tmp));
			}
		}
	}
}
