package Acmicpc.As.B2.TenThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeunWuDiary16676 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 1, v = 11;
		
		while(N >= v) {
			v = 10*v+1;
			res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
