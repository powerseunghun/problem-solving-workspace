package Acmicpc.As.B4.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingClauses17903 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		
		if (n >= 8) System.out.println("satisfactory");
		else System.out.println("unsatisfactory");
		
		br.close();
	}
}
