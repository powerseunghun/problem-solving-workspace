package Acmicpc.OrderSubmit.Thousandth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuitarString1049 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), money = Integer.MAX_VALUE;
		int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, base = 0, pCount = 0;
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			a = Math.min(a, Integer.parseInt(tmp.split(" ")[0]));
			b = Math.min(a, Integer.parseInt(tmp.split(" ")[1]));
		}
		if (N <= 6) money = Math.min(a, b * N);
		else {
//			for (int i = 0; i <= (N/6)+1; i++) {
//				money = Math.min(money, a*i+b*Math.max(N-6*i, 0));
//			}
			while (base < N) {
				pCount++;
				base += 6;
			}
			if (base == N) money = Math.min(a * pCount, b * N);
			else {
				int val = ((pCount-1) * a) + ((N-(pCount-1) * 6)*b);
				money = Math.min(val, b*N);
				money = Math.min(pCount*a, money);
			}
		}
		
		System.out.println(money);
		br.close();
	}
}
