package basic;

import java.util.Scanner;

public class ThreeSixNine {
	public int getCount(int n) {
		int count = 0;
		while(n != 0) {
			if ((n % 10 != 0) && (n % 10) % 3 == 0) {
				count++;
			}
			n /= 10;
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ThreeSixNine tsn = new ThreeSixNine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			if (tsn.getCount(i) > 0) {
				for (int j = 0; j < tsn.getCount(i); j++) {
					System.out.print("K");
				}
				System.out.println();
			}
			else if (tsn.getCount(i) == 0){
				System.out.println(i);
			}
		}
	}
}
