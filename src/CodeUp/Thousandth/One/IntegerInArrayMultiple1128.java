package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerInArrayMultiple1128 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), t = 0, carry = 0;
		StringBuilder sb = new StringBuilder();
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = arr.length-1; i >= 0; i--) {
			t = arr[i] * n + carry;
			if (i != 0) {
				sb.append(t % 10);
				carry = t / 10;
			}
			else {
				while (t != 0) {
					sb.append(t % 10);
					t /= 10;
				}
			}
		}
		System.out.println(sb.reverse());
	}
}
