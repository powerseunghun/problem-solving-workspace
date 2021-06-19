package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HappyNumber4032 {
	static boolean check(int n) {
		// check logic
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		int[] squares = new int[10];
		for (int i = 0; i < squares.length; i++) {
			squares[i] = i * i;
		}
		map.clear();
		
	}
}
