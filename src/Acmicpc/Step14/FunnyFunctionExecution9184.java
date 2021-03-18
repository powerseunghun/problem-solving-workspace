package Acmicpc.Step14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FunnyFunctionExecution9184 {
	static Map<String, Integer> map = new HashMap<>();
	public int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}
		String inputMap = a + ", " + b + ", " + c;
		if (map.containsKey(inputMap)) {
			return map.get(inputMap);
		}
		
		if (a < b && b < c) {
			map.put(inputMap, w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c));
		}
		else {
			map.put(inputMap, w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1));
		}
		
		return map.get(inputMap);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FunnyFunctionExecution9184 ffe = new FunnyFunctionExecution9184();
		
		int a = 0, b = 0, c = 0;
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if (a == -1 && b == -1 && c == -1) break;
			
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + ffe.w(a, b, c));
		}
	}
}
