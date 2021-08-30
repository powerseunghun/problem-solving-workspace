package Acmicpc.Geometry.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Construction16485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int c = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		if (c % b == 0) {
			System.out.println(c/b);
		}
		else System.out.printf("%.10f", (double)c/b);
	}
}
