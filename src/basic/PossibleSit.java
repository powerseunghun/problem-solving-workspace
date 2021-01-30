package basic;

import java.util.Scanner;

public class PossibleSit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chairs = new int[sc.nextInt() + 2];
		int count = 0;
		
		for (int i = 1; i < chairs.length - 1; i++) {
			chairs[i] = sc.nextInt();
		}
		
		for (int i = 1; i < chairs.length - 1; i++) {
			if (chairs[i] == 0) {
				if (chairs[i-1] == 0 && chairs[i+1] == 0) count++;
			}
		}
		
		System.out.println(count);
	}
}
