package Acmicpc.As.B3.ThirtyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sticker33868 {
	static final int l = 7;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int T = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		
		
		while(--N > 0) {
			str = br.readLine();
			int a1 = Integer.parseInt(str.split(" ")[0]);
			int a2 = Integer.parseInt(str.split(" ")[1]);
			T = Math.max(T, a1);
			B = Math.min(B, a2);
		}
		
		System.out.println((T*B)%l+1);
		br.close();
	}
}
