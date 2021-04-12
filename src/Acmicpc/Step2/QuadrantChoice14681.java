package Acmicpc.Step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadrantChoice14681 {
	static int checkQuadrant(int x, int y) {
		if (x > 0) {
			if (y > 0) return 1;
			else return 4;
		}
		else {
			if (y > 0) return 2;
			else return 3;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		System.out.println(checkQuadrant(x, y));
	}
}
