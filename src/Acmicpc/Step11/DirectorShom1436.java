package Acmicpc.Step11;

import java.util.Scanner;

public class DirectorShom1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), sixCount = 0;
		int tmp = 0, num = 0;
		
		for (int i = 666; ; i++) {
			tmp = i;
			while (tmp != 0) {
				if (tmp % 1000 == 666) {
					num++;
					break;
				}
				else {
					tmp /= 10;
				}
			}
			if (num == N) {
				System.out.println(i);
				break;
			}
		}
	}
}
