package Acmicpc.As.B3.TenThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HerculesAndHydra10205 {
	static int func(int N, String tmp) {
		for (int i = 0; i < tmp.length(); i++) {
			switch(tmp.charAt(i)) {
			case 'c':
				N++;
				break;
			case 'b':
				N--;
				break;
			}
		}
		return N;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), N = 0;
		String tmp = null;
		
		for (int i = 1; i <= K; i++) {
			sb.append("Data Set " + i + ":\n");
			N = Integer.parseInt(br.readLine());
			tmp = br.readLine();
			
			sb.append(func(N, tmp) + "\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
