package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpStairsCondition2641 {
	static int count = 0;
	static void bt(int pPrev, int prev, int sum, int n) {
		if (sum >= n) {
			count = sum == n ? count + 1 : count;
			return;
		}
		for (int i = 1; i <= 3; i++) {
			if (i == 3) {
				if (prev != 3 && pPrev != 3) {
					bt(prev, i, sum+i, n);
				}
			}
			else bt(prev, i, sum+i, n);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		bt(0, 0, 0, n);
		
		System.out.println(count);
	}
}
