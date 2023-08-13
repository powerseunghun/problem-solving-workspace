package Acmicpc.As.B1.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodCompression5043 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long N = Long.parseLong(str.split(" ")[0]);
		long b = Long.parseLong(str.split(" ")[1]);
		long res = (long) (Math.pow(2, b+1)-1);
		
		System.out.println(N <= res ? "yes" : "no");
		br.close();
	}
}
