package Acmicpc.As.B4.ThirtyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StampTour34543 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int W = Integer.parseInt(br.readLine()), res = N*10;
		
		
		res = N>=5 ? res+70 : N >= 3 ? res+20 : res;
		res = W>1000 ? res-15 : res;
		
		System.out.println(Math.max(res, 0));
		br.close();
	}
}
