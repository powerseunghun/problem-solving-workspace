package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower3424 {
	static int count = 0;
	static StringBuilder sb = new StringBuilder();
	static void hanoi(int N, char start, char to, char pass) {
		count++;
		if (N == 1) {
			sb.append("move disk 1 " + start + "->" + to + "\n");
			return;
		}
		else {
			hanoi(N-1, start, pass, to);
			sb.append("move disk " + N + " " + start + "->" + to + "\n");
			hanoi(N-1, pass, to, start);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N, 'A', 'C', 'B');
		System.out.println(count);
		System.out.print(sb);
	}
}
