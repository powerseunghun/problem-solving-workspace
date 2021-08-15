package Acmicpc.BruteForceAlgorithm.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ring5555 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), input = null;
		int N = Integer.parseInt(br.readLine()), count = 0;
		
		for (int i = 0; i < N; i++) {
			input = br.readLine();
			input += input;
			if (input.contains(str)) count++;
		}
		
		System.out.println(count);
	}
}
