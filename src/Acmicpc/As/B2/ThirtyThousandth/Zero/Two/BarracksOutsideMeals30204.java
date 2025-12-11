package Acmicpc.As.B2.ThirtyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BarracksOutsideMeals30204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.split(" ")[0]);
		int X = Integer.parseInt(str.split(" ")[1]), sum = 0;
		
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum % X == 0 ? "1" : "0");
		br.close();
	}
}
