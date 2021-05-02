package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeforeThirtyMinute1173 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		if (b < 30) {
			a = a == 0 ? 23 : a - 1;
			b += 30;
		}
		else {
			b -= 30;
		}
		
		System.out.println(a + " " + b);
	}
}
