package Acmicpc.As.B3.TwentyThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThisProblemIsDTwo23303 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println((str.contains("D2") || str.contains("d2")) ? "D2" : "unrated");
		br.close();
	}
}
