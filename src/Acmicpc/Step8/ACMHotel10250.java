package Acmicpc.Step8;

import java.util.Scanner;

public class ACMHotel10250 {
	public static void main(String[] args) {
		int T = 0, W = 0, H = 0, N = 0;
		String room = "";
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			room = "";
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();
			room += (N % H) == 0 ? H : (N % H);
			if (N % H == 0) {
				room += (N / H) < 10 ? "0" + (N / H) : (N / H);
 			}
			else {
				room += (N / H) < 9 ? "0" + ((N / H) + 1) : ((N / H) + 1);
			}
			System.out.println(room);
		}
	}
}
