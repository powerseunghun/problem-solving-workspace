package Acmicpc.As.B3.ThirtyThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toilet30642 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean flag = br.readLine().equals("annyong");
		int K = Integer.parseInt(br.readLine());
		
		K = flag ? K%2 == 0 ? K+1 : K : K%2 != 0 ? K+1 : K;
		
		System.out.println(K > N ? K-2 : K);
		br.close();
	}
}
