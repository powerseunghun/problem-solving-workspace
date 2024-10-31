package Acmicpc.As.B3.ThirtyThousandth.Two.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AttentionToTheMeeting32432 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine()), res = 1;
		
		while(true) {
			if ((N*res) + (N-1) > T) break;
			res++;
		}
		System.out.println(res-1);
		br.close();
	}
}
