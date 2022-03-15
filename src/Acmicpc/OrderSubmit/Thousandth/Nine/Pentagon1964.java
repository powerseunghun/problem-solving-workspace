package Acmicpc.OrderSubmit.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pentagon1964 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long res = 5, w = 7;
		int N = Integer.parseInt(br.readLine());
		// 5, (5+7), (5+7+10), (5+7+10+13)
		// 5, 12, 22, 35
		for (int i = 2; i <= N; i++) {
			res += w;
			res %= 45678;
			w += 3;
		}
		
		System.out.println(res);
		br.close();
	}
}
