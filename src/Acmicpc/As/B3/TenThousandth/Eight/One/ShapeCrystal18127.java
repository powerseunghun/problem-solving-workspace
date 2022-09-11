package Acmicpc.As.B3.TenThousandth.Eight.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeCrystal18127 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int tmpA = Integer.parseInt(tmp.split(" ")[0]);
		int tmpB = Integer.parseInt(tmp.split(" ")[1]);
		long a = tmpA-1, d = tmpA-2, res = 0;
		
		res = tmpB * (2*a + (tmpB-1) * d) / 2;
		System.out.println(res+1);
		br.close();
	}
}
