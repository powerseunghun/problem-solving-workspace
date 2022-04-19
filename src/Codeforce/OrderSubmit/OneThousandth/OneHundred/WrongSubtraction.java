package Codeforce.OrderSubmit.OneThousandth.OneHundred;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class WrongSubtraction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int cmd = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < cmd; i++) {
			N = N%10 == 0 ? N/10 : N-1;
		}
		
		System.out.println(N);
		br.close();
	}
}
