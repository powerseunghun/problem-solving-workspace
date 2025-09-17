package Acmicpc.As.B3.ThirtyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DailyQuest34001 {
	static int[][] arr1 = {
			{200, 210, 220}, {210, 220, 225}, {220, 225, 230},
			{225, 230, 235}, {230, 235, 245}, {235, 245, 250}
	};
	static int[][] arr2 = {
			{260, 265, 270}, {265, 270, 275}, {270, 275, 280},
			{275, 280, 285}, {280, 285, 290}, {285, 290, 295}, {290, 295, 300}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int L = Integer.parseInt(br.readLine());
		for (int i = 0; i < arr1.length; i++) {
			if (L < arr1[i][0]) {
				sb.append(0);
			} else if (L < arr1[i][1]) {
				sb.append(500);
			} else if (L < arr1[i][2]) {
				sb.append(300);
			} else {
				sb.append(100);
			}
			sb.append(" ");
		}
		sb.append("\n");
		
		for (int i = 0; i < arr2.length; i++) {
			if (L < arr2[i][0]) {
				sb.append(0);
			} else if (L < arr2[i][1]) {
				sb.append(500);
			} else if (L < arr2[i][2]) {
				sb.append(300);
			} else {
				sb.append(100);
			}
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
