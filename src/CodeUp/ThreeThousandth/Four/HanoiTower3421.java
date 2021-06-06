package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower3421 {
	static int count = 0;
	static void hanoi(int N, char start, char to, char pass) {
		count++;
		if (N == 1) return;
		else {
			hanoi(N-1, start, pass, to);
			hanoi(N-1, pass, to, start);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N, 'A', 'C', 'B');
		
		System.out.println(count);
	}
}
