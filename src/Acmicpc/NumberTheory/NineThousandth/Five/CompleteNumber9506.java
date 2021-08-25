package Acmicpc.NumberTheory.NineThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CompleteNumber9506 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		ArrayList<Integer> divs = new ArrayList<>();
		int n = 0, sum = 0;
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == -1) return;
			sum = 0;
			divs.clear();
			
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					divs.add(i);
					sum += i;
				}
			}
			if (sum == n && divs.size() != 0) {
				sb.append(n + " = ");
				for (int i = 0; i < divs.size(); i++) {
					sb.append(divs.get(i))
					if (i != divs.size()-1) sb.append(" + ");
				}
				sb.append("\n");
			}
			else {
				sb.append(n + " is NOT perfect.\n");
			}
		}
		System.out.print(sb.toString());
	}
}
