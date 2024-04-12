package Acmicpc.As.B5.ThirtyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EveryoneIsWinner31450 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int M = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(M%K == 0 ? "Yes" : "No");
		br.close();
	}
}
