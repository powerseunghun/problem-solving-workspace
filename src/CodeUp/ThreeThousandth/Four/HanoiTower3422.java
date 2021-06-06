package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower3422 {
	static int count = 0;
	static boolean check = false;
	static void hanoi(int N, char start, char to, char pass, long move) {
		count++;
		System.out.println("count : " +count + " move : " + move);
		if (count == move) {
			check = true;
			System.out.println(N);
			return;
		}
		if (N == 1) {
			System.out.println("Disk 1 : " + start + " to " + to);
			return;
		}
		else {
			hanoi(N-1, start, pass, to, move);
			System.out.println("Disk " + N + " : " + start + " to " + to);
			hanoi(N-1, pass, to, start, move);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		for (int i = 1; ; i++) {
			if (check) return;
			count = 0;
			hanoi(i, 'A', 'C' ,'B', N);
			System.out.println("count : " + count);
		}
	}
}
