package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RecursionNumericSystem1921 {
	static Map<Integer, Character> map = new HashMap<>();
	static void init() {
		map.put(0, '0'); map.put(1, '1'); map.put(2, '2'); map.put(3, '3');
		map.put(4, '4'); map.put(5, '5'); map.put(6, '6'); map.put(7, '7');
		map.put(8, '8'); map.put(9, '9'); map.put(10, 'A'); map.put(11, 'B');
		map.put(12, 'C'); map.put(13, 'D'); map.put(14, 'E'); map.put(15, 'F');
	}
	static void f(int n, int k) {
		if (n == 0) return;
		else {
			f(n/k, k);
			System.out.print(map.get(n%k));
		}
	}
	public static void main(String[] args) throws IOException {
		init();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		
		f(n, k);
	}
}
