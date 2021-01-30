package Practice;

import java.util.Scanner;

public class MakeSNS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(sc.next().split(",")[2]);
		}
		System.out.printf("%.2f\n", (sum / (double) n));
	}
}
