package CodeUp.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeSNS2413 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int fCount = 0;
		
		for (int i = 0; i < n; i++) {
			fCount += br.readLine().split(",").length-3;
		}
		
		System.out.printf("%.2f\n", fCount / (double)n);
	}
}
