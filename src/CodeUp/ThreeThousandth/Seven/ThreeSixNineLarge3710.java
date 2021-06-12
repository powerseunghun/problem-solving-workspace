package CodeUp.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThreeSixNineLarge3710 {
	static int[] memo = null;
	static int clab(int n) {
		int tmp = n;
		int value = 0;
		
		if (memo[n] != 0) {
			return memo[n];
		}
		
		while (tmp != 0) {
			if (memo[tmp] != 0) {
				value += memo[tmp];
				break;
			}
			else {
				int t = tmp % 10;
				if (t % 3 == 0 && t != 0) value++;
				tmp /= 10;
			}
		}
		return memo[n] = value;
	}
	static int solution(int a, int b) {
		int res = 0;
		for (int i = a; i <= b; i++) {
			res += clab(i);
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		memo = new int[100000001];
		Arrays.fill(memo, 0);
		
		for (int i = 1; i <= (9 >= b ? b : 9) ; i++) {
			memo[i] = i % 3 == 0 ? 1 : 0;
		}
		
		System.out.println(solution(a, b));
	}
}
