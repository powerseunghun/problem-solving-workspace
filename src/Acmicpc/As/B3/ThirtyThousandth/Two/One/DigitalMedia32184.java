package Acmicpc.As.B3.ThirtyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitalMedia32184 {
	static int func(int A, int B){
		return 1+(B-A+(A%2) - (B%2)) / 2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(func(A, B));
		br.close();
	}
}
