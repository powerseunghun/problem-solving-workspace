package Acmicpc.As.B3.ThirtyThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilitaryClock33277 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int res = 60*M*24/N;
		
		System.out.println(String.format("%02d", res/60) + ":" + String.format("%02d", res%60));
		br.close();
	}
}
