package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Factorization {
	static List<Integer> list = new ArrayList<>();
	static void factorization(int N) {
		for (int i = 2; N != 1;) {
			if (N % i == 0) {
				list.add(i);
				N /= i;
			}
			else i++;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		factorization(N);
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i != list.size()-1) sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
