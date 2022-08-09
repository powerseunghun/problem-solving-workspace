package Acmicpc.As.B3.TenThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volta13610 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]), B = Integer.parseInt(tmp.split(" ")[1]), i = 1;
		
		for (i = 1;;i++) {
			if (B*i - A*i >= B) break;
		}
		
		System.out.println(i);
		br.close();
	}
}
