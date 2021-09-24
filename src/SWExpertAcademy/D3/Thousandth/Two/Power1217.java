package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power1217 {
	static int power(int N, int M) {
		if (M == 0) return 1;
		else return N * power(N, M-1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = 0, M = 0;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			sb.append("#" + i + " " + power(N, M) + "\n");
		}
		System.out.print(sb.toString());
	}
}
