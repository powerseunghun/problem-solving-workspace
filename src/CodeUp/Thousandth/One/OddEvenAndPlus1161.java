package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenAndPlus1161 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int[] arr = {Integer.parseInt(tmp.split(" ")[0]), Integer.parseInt(tmp.split(" ")[1])};
		String[] d = {"짝수", "홀수"};
		String[] op = {"+", "="};
		
		for (int i = 0; i < arr.length + 1; i++) {
			if (i == arr.length) {
				if ((arr[0] + arr[1]) % 2 == 0) {
					System.out.println("짝수");
				}
				else {
					System.out.println("홀수");
				}
			}
			else {
				System.out.print(d[arr[i] % 2] + op[i]);
			}
		}
	}
}
