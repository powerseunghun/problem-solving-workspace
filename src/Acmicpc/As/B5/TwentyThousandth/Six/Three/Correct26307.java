package Acmicpc.As.B5.TwentyThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct26307 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int H = Integer.parseInt(tmp.split(" ")[0]);
		int S = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println((H-9) * 60 + S);
		br.close();
	}
}
