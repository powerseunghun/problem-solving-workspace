package Acmicpc.As.B3.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGuessGame4892 {
	static int[] ns = new int[5];
	static void calc() {
		ns[1] = 3 * ns[0];
		ns[2] = ns[1] % 2 == 0 ? ns[1]/2 : (ns[1]+1)/2;
		ns[3] = 3 * ns[2];
		ns[4] = ns[3] / 9;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; ; i++ ) {
			ns[0] = Integer.parseInt(br.readLine());
			if (ns[0] == 0) break;
			calc();
			sb.append(i + ". " + (ns[1] % 2 == 0 ? "even " : "odd ") + ns[4] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
