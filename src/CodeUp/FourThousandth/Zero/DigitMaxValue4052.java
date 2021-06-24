package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DigitMaxValue4052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = 0, sum = 0, min = Integer.MAX_VALUE, tmp = 0;
		
		for (int i = 0, val = 0; i < 10; i++) {
			val = Integer.parseInt(st.nextToken());
			tmp = val;
			sum = 0;
			while (tmp != 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			max = max >= sum ? max : sum;
			min = sum > min ? min : sum;
		}
		System.out.println(max + " " + min);
	}
}
