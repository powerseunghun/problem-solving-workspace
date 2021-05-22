package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPathHanoi2698 {
	static int count = 0;
	static void print(int N, char from, char to, char th) {
		System.out.println(N + " : "  + from + "->" + th);
		System.out.println(N + " : "  + th + "->" + to);
		count += 2;
	}
	static void print(int N, char from, char to) {
		System.out.println(N + " : " + from + "->" + to);
		count += 1;
	}
	static void hanoi(int N, char from, char to, char th) {
		// first Input from -> A , to -> C, th -> B
		if (N == 1) {
			print(N, from, to, th);
		}
		else {
			hanoi(N-1, from, to, th);
			print(N, from, th);
			hanoi(N-1, to, from, th);
			print(N, th, to);
			hanoi(N-1, from, to, th);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		hanoi(n, 'A', 'C', 'B');
		System.out.println(count);
	}
}
