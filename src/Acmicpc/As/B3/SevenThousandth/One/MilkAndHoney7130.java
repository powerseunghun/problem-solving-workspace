package Acmicpc.As.B3.SevenThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilkAndHoney7130 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int M = Integer.parseInt(str.split(" ")[0]);
		int H = Integer.parseInt(str.split(" ")[1]);
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while(N-- > 0) {
			str = br.readLine();
			res += Math.max(Integer.parseInt(str.split(" ")[0])*M, Integer.parseInt(str.split(" ")[1])*H);
		}
		
		System.out.println(res);
		br.close();
	}
}
