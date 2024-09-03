package Acmicpc.As.B3.TwentyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Двастанка24867 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long k = Long.parseLong(br.readLine());
		String str = br.readLine();
		long a = Long.parseLong(str.split(" ")[0]);
		long x = Long.parseLong(str.split(" ")[1]);
		str = br.readLine();
		long b = Long.parseLong(str.split(" ")[0]);
		long y = Long.parseLong(str.split(" ")[1]);
		long res1 = Math.max(0, k-a)*x + Math.max(0, k-a-b)*y;
		long res2 = Math.max(0, k-b)*y + Math.max(0, k-a-b)*x;
		
		System.out.println(Math.max(0, Math.max(res1, res2)));
		br.close();
	}
}
