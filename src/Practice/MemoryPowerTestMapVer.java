package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemoryPowerTestMapVer {
	public static void main(String[] args) {
		Map<Integer, Integer> list = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = 0, q = 0;
		
		for (int i = 0; i < n; i++) {
			list.put(sc.nextInt(), i + 1);
		}
		m = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			q = sc.nextInt();
			if (!list.containsKey(q)) System.out.print(-1 + " ");
			else System.out.print(list.get(q) + " ");
		}
	}
}
