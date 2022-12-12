package Acmicpc.As.B2.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineUp1681 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int L = Integer.parseInt(tmp.split(" ")[1]), i = 1, res = 0;
		
		for (i = 1; res != N; i++) {
			if ((i+"").contains(L+"")) continue;
			res++;
		}
		
		System.out.println(i-1);
		br.close();
	}
}
