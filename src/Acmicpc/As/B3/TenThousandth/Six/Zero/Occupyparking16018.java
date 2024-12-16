package Acmicpc.As.B3.TenThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Occupyparking16018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String a = br.readLine();
		String b = br.readLine();
		int res = 0;
		
		for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
			if (a.charAt(i) == 'C' && b.charAt(i) == 'C') res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
