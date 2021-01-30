package basic;

import java.util.Scanner;

public class LinearStructureSearch2 {
	public int getIndex(int[] num, int k) {
		int f = 0, b = num.length - 1, key = 0;
		while(f <= b) {
			key = (f + b) / 2;
			if (num[key] == k) return key + 1; 
			if (k <= num[key]) {
				b = key - 1;
			}
			else {
				f = key + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearStructureSearch2 lss = new LinearStructureSearch2();
		int[] num = new int[sc.nextInt()];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int r = sc.nextInt();
		
		for (int i = 0; i < r; i++) {
			System.out.println(lss.getIndex(num, sc.nextInt()));
		}
	}
}
