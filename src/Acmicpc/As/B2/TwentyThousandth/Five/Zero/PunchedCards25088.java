package Acmicpc.As.B2.TwentyThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PunchedCards25088 {
	static char[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), R = 0, C = 0;
		String str = null;
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			R = Integer.parseInt(str.split(" ")[0]);
			C = Integer.parseInt(str.split(" ")[1]);
			arr = new char[2*R+1][2*C+1];
			for (int j = 0; j < arr.length; j++) {
				Arrays.fill(arr[j], '.');
			}
			sb.append("Case #").append(i).append(":").append("\n");
			
			for (int j = 0; j < 2*R+1; j+=2) {
				for (int k = 0; k < 2*C+1; k += 2) {
					arr[j][k] = '+';
				}
			}
			for (int j = 1; j <2*R+1; j+=2) {
				for (int k = 0; k < 2*C+1; k+=2) {
					arr[j][k] = '|';
				}
			}
			for (int j = 0; j < 2*R+1; j+=2) {
				for (int k = 1; k < 2*C+1; k+=2) {
					arr[j][k] = '-';
				}
			}
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					arr[j][k] = '.';
				}
			}
			
			for (int j = 0; j < 2*R+1; j++) {
				for (int k = 0; k < 2*C+1; k++) {
					sb.append(arr[j][k]);
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
