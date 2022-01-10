package Goorm.AlgorithmHeroes.T9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TCell {
	static int getPower(int N) {
		int power = 0;
		while (Math.pow(2, power) <= N) {
			power++;
		}
		return power-1;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), power = 0;
		
		while (N != 0) {
			power = getPower(N);
			list.add(power);
			N -= Math.pow(2, power);
		}
		
		System.out.println(list.size());
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i) + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
