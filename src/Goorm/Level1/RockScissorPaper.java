package Goorm.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RockScissorPaper {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] counts = new int[4], variable = new int[4];
		int rsp = 0, sum = 0;
		
		while (st.hasMoreTokens()) {
			rsp = Integer.parseInt(st.nextToken());
			counts[rsp]++;
			variable[rsp] = 1;
		}
		for (int i = 1; i < variable.length; i++) {
			sum += variable[i];
		}
		if (sum == 1 || sum == 3) {
			System.out.println("0");
			return;
		}
		
		if (variable[1] > 0 && variable[2] > 0) {
			System.out.println(counts[2]);
		}
		else if (variable[1] > 0 && variable[3] > 0) {
			System.out.println(counts[1]);
		}
		else if (variable[2] > 0 && variable[3] > 0) {
			System.out.println(counts[3]);
		}
	}
}
