package Practice;

import java.util.Scanner;

public class MakeSNS3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += sc.next().split(",").length - 3;
		}
		System.out.printf("%.2f\n", (sum / (double) n));
	}
}
