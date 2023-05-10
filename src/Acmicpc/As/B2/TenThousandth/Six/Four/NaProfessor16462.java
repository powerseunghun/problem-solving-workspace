package Acmicpc.As.B2.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NaProfessor16462 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		String str = null;
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			str = str.replaceAll("0|6", "9");
			sum += Math.min(Integer.parseInt(str), 100);
			
		}
		
		System.out.println(String.format("%.0f", (double)sum/N));
		br.close();
	}
}
