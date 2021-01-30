package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarf {
	public static void main(String[] args) {
		int[] dwarfs = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < dwarfs.length; i++) {
			dwarfs[i] = sc.nextInt();
		}
		Arrays.sort(dwarfs);
		
		System.out.println(dwarfs[6]);
		System.out.println(dwarfs[5]);
	}
}
