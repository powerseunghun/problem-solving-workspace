package Acmicpc.As.B5.TenThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarFruit17496 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int T = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]);
		int P = Integer.parseInt(tmp.split(" ")[3]), sum = 0;
		
		for (int i = 1; i <= (N-T); i += T) {
			sum += (C * P);
		}
		
		System.out.println(sum);
		br.close();
	}
}
