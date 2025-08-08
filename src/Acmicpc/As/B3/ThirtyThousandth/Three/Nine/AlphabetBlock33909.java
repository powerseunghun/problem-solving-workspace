package Acmicpc.As.B3.ThirtyThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetBlock33909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int S = Integer.parseInt(str.split(" ")[0]);
		int C = Integer.parseInt(str.split(" ")[1]);
		int O = Integer.parseInt(str.split(" ")[2]);
		int N = Integer.parseInt(str.split(" ")[3]);
		
		System.out.println(Math.min((S+N/3), (C+O*2)/6));
		br.close();
	}
}
