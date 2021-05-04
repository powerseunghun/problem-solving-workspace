package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddCondtionSum1279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		
		for (int i = a; i <= b; i++) {
			sum = i % 2 == 0 ? sum - i : sum + i;
		}
		
		System.out.println(sum);
	}
}
