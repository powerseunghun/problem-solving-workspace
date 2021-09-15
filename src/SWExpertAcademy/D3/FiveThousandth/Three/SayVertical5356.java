package SWExpertAcademy.D3.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SayVertical5356 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[][] arr = new String[5][1];
		int T = Integer.parseInt(br.readLine()), maxLength = 0;
		
		for (int i = 1; i <= T; i++) {
			for (int j = 0; j < 5; j++) {
				arr[j][0] = br.readLine();
				maxLength = Math.max(arr[j][0].length(), maxLength);
			}
			sb.append("#" + i + " ");
			for (int j = 0; j < maxLength; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[k][0].length() <= j) continue;
					sb.append(arr[k][0].charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
