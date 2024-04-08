package Acmicpc.As.B5.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingTroulbe31654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int C = Integer.parseInt(str.split(" ")[2]);
		
		System.out.println(A+B==C ? "correct!" : "wrong!");
		br.close();
	}
}
