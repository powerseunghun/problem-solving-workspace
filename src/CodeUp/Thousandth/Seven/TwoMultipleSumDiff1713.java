package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoMultipleSumDiff1713 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0 && i % 4 == 0) continue;
			if (i % 3 == 0) sum += i;
			else if (i % 4 == 0) sum -= i;
		}
		
		System.out.println(sum);
	}
}
