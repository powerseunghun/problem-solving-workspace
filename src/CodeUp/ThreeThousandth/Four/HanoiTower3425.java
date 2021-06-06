package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower3425 {
	static int count = 0;
	static void print(int N, char from, char to, char pass) {
		System.out.println(N + " : "  + from + "->" + pass);
		System.out.println(N + " : "  + pass + "->" + to);
		count += 2;
	}
	static void print(int N, char from, char to) {
		System.out.println(N + " : " + from + "->" + to);
		count += 1;
	}
	static void hanoi(int N, char from, char to, char pass) {
		// first Input from -> A , to -> C, th -> B
		if (N == 1) {
			print(N, from, to, pass);
		}
		else {
			hanoi(N-1, from, to, pass);
			print(N, from, pass);
			hanoi(N-1, to, from, pass);
			print(N, pass, to);
			hanoi(N-1, from, to, pass);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		hanoi(n, 'A', 'C', 'B');
		System.out.println(count);
	}
}
