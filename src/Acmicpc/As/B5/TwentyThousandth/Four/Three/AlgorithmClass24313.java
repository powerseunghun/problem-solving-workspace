package Acmicpc.As.B5.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorithmClass24313 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a1 = Integer.parseInt(str.split(" ")[0]);
		int a0 = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		boolean flag = true;
		
		for (int i = 1; i <= n0 && flag; i++) {
			flag = !(a1 * n0 + a0 > n0 * c);
			System.out.println("i : " +i);
//			if (a1 * n0 + a0 < n0 * c) {
//				flag = false;
//				break;
//			}
		}
		
		System.out.println(flag ? "1" : "0");
		br.close();	}
}
