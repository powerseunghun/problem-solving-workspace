package Acmicpc.As.B3.TwentyThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stopwatch21197 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), t = 0, sum = 0;
		boolean flag = N % 2 != 0;
		
		if (flag) {
			System.out.println("still running");
		}
		else {
			while(N > 0) {
				sum += Math.abs(Integer.parseInt(br.readLine()) - Integer.parseInt(br.readLine()));
				N -= 2;
			}
			System.out.println(sum);
		}
		br.close();
	}
}
