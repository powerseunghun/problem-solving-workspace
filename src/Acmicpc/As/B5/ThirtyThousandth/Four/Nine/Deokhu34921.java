package Acmicpc.As.B5.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deokhu34921 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int T = Integer.parseInt(str.split(" ")[1]);
		int res = 10+2*(25-A+T);
		
		System.out.println(res < 0 ? 0 : res);
		br.close();
	}
}
