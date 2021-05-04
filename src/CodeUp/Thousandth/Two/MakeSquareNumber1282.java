package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeSquareNumber1282 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int tmp = n;
		while(true) {
			if (Math.sqrt(tmp) - (int)Math.sqrt(tmp) == 0) break;
			else tmp--;
		}
		
		System.out.println(n - tmp + " " + (int)Math.sqrt(tmp));
	}
}
