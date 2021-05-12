package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeTriangleTire1679 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean flag = false;
		
		for (int a = 1; a <= (int) n/2; a++) {
			for (int b = 1; b <= (int)((n-1)/2); b++) {
				if ((a + b) > (n-a-b) && a+b+(n-a-b) == n) {
					if (a <= b && b <= (n-a-b)) {
						flag = true;
						System.out.println(a + " " + b + " " + (n-a-b));
					}
				}
			}
		}
		
		if (!flag) System.out.println("-1");
	}
}
