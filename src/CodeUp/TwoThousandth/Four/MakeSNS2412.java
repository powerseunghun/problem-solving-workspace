package CodeUp.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeSNS2412 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ageSum = 0;
		
		for (int i = 0; i < n; i++) {
			ageSum += Integer.parseInt(br.readLine().split(",")[2]);
		}
		
		System.out.printf("%.2f\n", ageSum / (double)n);
	}
}
