package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile4862 {
	static long[] arr = null;
	static boolean[] check = null;
	static long f(int N) {
		if (check[N]) return arr[N];
		if (N == 1) {
			check[N] = true;
			return arr[N] = 4;
		}
		else if (N == 2) {
			check[N] = true;
			return arr[N] = 6;
		}
		else {
			check[N] = true;
			return arr[N] = f(N-1) + f(N-2);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new long[N+1];
		check = new boolean[N+1];
		System.out.println(f(N));
	}
}
