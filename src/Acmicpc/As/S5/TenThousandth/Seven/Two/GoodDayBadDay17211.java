package Acmicpc.As.S5.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoodDayBadDay17211 {
	static double[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		double G = Integer.parseInt(str.split(" ")[1]);
		arr = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		G = (1-G) * 1000;
		for (int i = 0; i < N; i++) {
			G = G*arr[0]+(1000-G)*arr[2];
		}
		
		System.out.println(String.format("%.0f", G));
		System.out.println(String.format("%.0f", 1000-G));
		br.close();
	}
}