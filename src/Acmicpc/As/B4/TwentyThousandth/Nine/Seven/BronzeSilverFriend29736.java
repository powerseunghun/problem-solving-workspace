package Acmicpc.As.B4.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BronzeSilverFriend29736 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int K = Integer.parseInt(str.split(" ")[0]);
		int X = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		for (int i = K-X; i <= K+X; i++) {
			if (i >= A && i <= B) res++;
		}
		
		System.out.println(res == 0 ? "IMPOSSIBLE" : res);
		br.close();
	}
}
