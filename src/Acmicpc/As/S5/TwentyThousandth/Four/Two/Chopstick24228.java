package Acmicpc.As.S5.TwentyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chopstick24228 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long N = Long.parseLong(str.split(" ")[0]);
		long R = Long.parseLong(str.split(" ")[1]);
		
		System.out.println(R*2+N-1);
		br.close();
	}
}
