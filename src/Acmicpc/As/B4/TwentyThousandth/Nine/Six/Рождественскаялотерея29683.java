package Acmicpc.As.B4.TwentyThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Рождественскаялотерея29683 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine().split(" ")[1]), res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			res += Integer.parseInt(st.nextToken()) / r;
		}
		
		System.out.println(res);
		br.close();
	}
}
