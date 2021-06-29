package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiffSequenceMaxLength4460 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int start = (int)Math.floor(n * 0.61803), end = (int)Math.ceil(n * 0.61803);
		int count = 1, maxCount = 0, firstNumber = 0, secondNumber = 0, num = 0;
		
		for (int i = start; i <= end; i++) {
			firstNumber = n;
			secondNumber = i;
			count = 2;
			while (firstNumber - secondNumber >= 0) {
				count++;
				int tmp = firstNumber - secondNumber;
				firstNumber = secondNumber;
				secondNumber = tmp;
			}
			if (count >= maxCount) {
				maxCount = count;
				num = i;
			}
		}
		System.out.println(maxCount);
		System.out.print(n + " " + num);
		while (true) {
			if (n - num >= 0) {
				System.out.print(" " + (n - num));
				int tmp = n - num;
				n = num;
				num = tmp;
			}
			else break;
		}
	}
}
