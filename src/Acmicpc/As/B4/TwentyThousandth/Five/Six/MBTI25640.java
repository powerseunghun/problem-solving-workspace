package Acmicpc.As.B4.TwentyThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MBTI25640 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while (N-- > 0) {
			res = br.readLine().equals(str) ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
