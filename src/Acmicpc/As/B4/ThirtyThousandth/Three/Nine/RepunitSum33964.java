package Acmicpc.As.B4.ThirtyThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepunitSum33964 {
	static int getR(int X) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < X; i++) {
			sb.append("1");
		}
		return Integer.parseInt(sb.toString());	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		
		for (int i = 0; i < str.split(" ").length; i++) {
			sum += getR(Integer.parseInt(str.split(" ")[i]));
		}
		
		System.out.println(sum);
		br.close();
	}
}
