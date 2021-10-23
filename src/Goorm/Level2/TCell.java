package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TCell {
	static List<Integer> list = new ArrayList<>();
	static int getDivide(int N) {
		int base = 0;
		while (true) {
			if (Math.pow(2, base) > N) break;
			else base++;
		}
		return base != 0 ? base-1 : base;
	}
	static void func(int N) {
		int divide = 0;
		while (N != 0) {
			divide = getDivide(N);
			list.add(divide);
			N -= Math.pow(2, divide);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		func(N);
		
		if (list.size() == 0) list.add(0);
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}
}
