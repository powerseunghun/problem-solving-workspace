package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower3420 {
	static void hanoi(int N, char start, char to, char pass) {
		if (N == 1) {
			System.out.println("Disk 1 : " + start + " to " + to);
			return;
		}
		else {
			hanoi(N-1, start, pass, to);
			System.out.println("Disk " + N + " : " + start + " to " + to);
			hanoi(N-1, pass, to, start);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N, 'A', 'C', 'B');
	}
}
