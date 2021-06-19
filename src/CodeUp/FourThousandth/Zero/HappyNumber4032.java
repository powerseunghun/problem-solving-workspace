package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HappyNumber4032 {
	static Map<Integer, Integer> map = new HashMap<>();
	static int getSquare(int n) {
		return n * n;
	}
	static boolean check(int n) {
		int value = 0, tmp = n;
		while(value != 1) {
			value = 0;
			while (tmp != 0) {
				value += getSquare(tmp % 10);
				tmp /= 10;
			}
			if (map.containsKey(value)) {
				return false;
			}
			else map.put(value, 1);
			tmp = value;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = n; i >= 1; i--) {
			if (check(i)) {
				System.out.println(i);
				return;
			}
		}
	}
}
