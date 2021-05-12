package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TSNWithoutIter1705 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), tmp = n;
		boolean flag = false;
		
		if (tmp % 10 == 3 || tmp % 10 == 6 || tmp % 10 == 9) {
			flag = true;
			System.out.print("K");
		}
		tmp /= 10;
		
		if (tmp % 10 == 3 || tmp % 10 == 6 || tmp % 10 == 9) {
			flag = true;
			System.out.print("K");
		}
		tmp/=10;
		
		if (tmp % 10 == 3 || tmp % 10 == 6 || tmp % 10 == 9) {
			flag = true;
			System.out.print("K");
		}
		tmp/=10;
		
		if (!flag) System.out.println(n);
		
	}
}
