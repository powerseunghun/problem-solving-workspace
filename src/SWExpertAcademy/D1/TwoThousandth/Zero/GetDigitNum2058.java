package SWExpertAcademy.D1.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetDigitNum2058 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), sum = 0;
		
		while (T != 0) {
			sum += T % 10;
			T /= 10;
		}
		
		System.out.println(sum);
	}
}
