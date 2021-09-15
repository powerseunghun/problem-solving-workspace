package SWExpertAcademy.D3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindCubeRoot5688 {
	static long func(long N) {
		for (long i = 1; i*i*i <= N; i++) {
			if (i * i * i == N) return i;
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Long.parseLong(br.readLine());
			sb.append("#" + i + " " + func(N) + "\n");
		}
		System.out.print(sb.toString());
	}
}
