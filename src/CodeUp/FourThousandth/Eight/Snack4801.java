package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snack4801 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int K = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int M = Integer.parseInt(tmp.split(" ")[2]);
		if (M >= K*N) {
			System.out.println("0");
			return;
		}
		System.out.println(K*N-M);
	}
}
