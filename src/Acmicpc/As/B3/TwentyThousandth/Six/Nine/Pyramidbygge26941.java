package Acmicpc.As.B3.TwentyThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramidbygge26941 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), w = 0, total = 0, res = 0;
		
		for (w = 1; total <= N; w+=2) {
			total += Math.pow(w, 2);
			res++;
		}
		
		System.out.println(res-Math.pow(w-2, 2) == N ? res : res-1);
		br.close();
	}
}
