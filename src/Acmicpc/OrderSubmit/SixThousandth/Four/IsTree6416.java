package Acmicpc.OrderSubmit.SixThousandth.Four;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IsTree6416 {
	static Map<Integer, Integer> map = new HashMap<>();
	static int r = 0, e = 0;
	static boolean flag = false;
	static void init() {
		map.clear();
		flag = true;
		e = 0;
		r = 0;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int a = 0, b = 0, numbering = 1;
		
		while (true) {
			init();
			while (true) {
				a = sc.nextInt();
				b = sc.nextInt();
				if (a == 0 && b == 0) break;
				if (a == -1 && b == -1) {
					System.out.print(sb.toString());
					return;
				}
				if (!map.containsKey(a)) {
					map.put(a, 0);
				}
				else map.put(a, map.get(a));
				if (!map.containsKey(b)) {
					map.put(b, 1);
				}
				else map.put(b, map.get(b)+1);
				e++;
			}
			for (int n : map.keySet()) {
				if (map.get(n) == 0) r++;
				else if(map.get(n)>1) {
					flag = false;
					break;
				}
			}
			sb.append("Case " + numbering++ + " is ");
			if (map.size() == 0 || (r == 1 && flag && map.size()-1 == e)) {
				sb.append("a tree.");
			}
			else sb.append("not a tree.");
			sb.append("\n");
		}
	}
}
