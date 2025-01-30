package Acmicpc.As.B2.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModularInverse15995 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]), res = -1;
		
		for (int i = 1; i <= m; i++) {
			if ((a*i) % m == 1) res = i;
		}
		
		System.out.println(res);
		br.close();
	}
}
