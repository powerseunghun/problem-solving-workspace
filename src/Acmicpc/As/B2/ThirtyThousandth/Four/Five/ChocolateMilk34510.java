package Acmicpc.As.B2.ThirtyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocolateMilk34510 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long H1 = Long.parseLong(str.split(" ")[0]);
		long H2 = Long.parseLong(str.split(" ")[1]);
		long H3 = Long.parseLong(str.split(" ")[2]);
		long N = Long.parseLong(br.readLine());
		long res = (H2+H3*2)*(N/2)+((N&1) != 0 ? H1+H2+H3 : 0);
		
		System.out.println(res);
		br.close();
	}
}
