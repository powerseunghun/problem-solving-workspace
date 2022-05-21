package Acmicpc.As.B4.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VonNeumannAndFly14924 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int S = Integer.parseInt(tmp.split(" ")[0]);
		int T = Integer.parseInt(tmp.split(" ")[1]);
		int D = Integer.parseInt(tmp.split(" ")[2]);
		
		System.out.println(D/(S*2) * T);
		br.close();
	}
}
