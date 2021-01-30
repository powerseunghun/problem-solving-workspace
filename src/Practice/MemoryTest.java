package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemoryTest {
	public static void main(String[] args) {
		Map<String, Integer> list = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), num = 0;
		String str = "";
		
		for (int i = 0; i < n; i++) {
			str = sc.next(); num = sc.nextInt();
			if (!list.containsKey(str)) {
				list.put(str, num);
			}
			else {
				list.put(str, list.get(str) + num);
			}
		}
		
		for (int i = 0; i < m; i++) {
			str = sc.next();
			if (!list.containsKey(str)) {
				System.out.println(0);
			}
			else {
				System.out.println(list.get(str));
			}
		}
	}
}
