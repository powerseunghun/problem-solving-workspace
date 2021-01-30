package Practice;

import java.util.Scanner;

public class FiboLarge {
	private long[] fiboNum = new long[200];
	public long fiboLarge(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			if (fiboNum[n] == 0) {
				fiboNum[n] = (fiboLarge(n - 2) + fiboLarge(n - 1)) % 10009;
			}
			return fiboNum[n];
		}
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		System.out.println(new FiboLarge().fiboLarge(n - 1));
	}
}

