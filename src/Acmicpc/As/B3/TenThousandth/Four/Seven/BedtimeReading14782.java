package Acmicpc.As.B3.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BedtimeReading14782 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0;
		
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (Math.pow(i, 2) == n) sum += i;
				else {
					sum += i;
					sum += n/i;
				}
			}
		}
		
		System.out.println(sum);
		br.close();
	}
}
