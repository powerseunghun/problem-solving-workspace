package Acmicpc.String.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangYoungVillage3028 {
	static void swap(int[] ball, int id1, int id2) {
		int tmp = ball[id1];
		ball[id1] = ball[id2];
		ball[id2] = tmp;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ball = { 1, 0, 0 };
		String com = br.readLine();
		
		for (int i = 0; i < com.length(); i++) {
			switch(com.charAt(i)) {
			case 'A':
				swap(ball, 0, 1);
				break;
			case 'B':
				swap(ball, 1, 2);
				break;
			case 'C':
				swap(ball, 0, 2);
				break;
			}
		}
		for (int i = 0; i < ball.length; i++) {
			if (ball[i] == 1) {
				System.out.println(i+1);
				return;
			}
		}
	}
}
