package Acmicpc.As.B3.TwentyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Рыцарскийщит20490 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		int m1 = Math.max(a, Math.max(b, c));
		str = br.readLine();
		int d = Integer.parseInt(str.split(" ")[0]);
		int e = Integer.parseInt(str.split(" ")[1]);
		int f = Integer.parseInt(str.split(" ")[2]);
		int m2 = Math.max(d, Math.max(e, f));
		
		System.out.println(a+b+c+d+e+f-Math.min(m1, m2)*2);
		br.close();
	}
}
