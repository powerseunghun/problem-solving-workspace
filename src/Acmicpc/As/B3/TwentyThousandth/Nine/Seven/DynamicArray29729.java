package Acmicpc.As.B3.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicArray29729 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int S = Integer.parseInt(str.split(" ")[0]), U = 0;
		int N = Integer.parseInt(str.split(" ")[1]);
		int M = Integer.parseInt(str.split(" ")[2]), a = 0;
		
		for (int i = 0; i < N+M; i++) {
			a = Integer.parseInt(br.readLine());
			if (a%2 == 1) {
				S = S == U ? S*2 : S;
				U++;
			}
			else {
				U--;
			}
		}
		
		System.out.println(S);
		br.close();
	}
}
