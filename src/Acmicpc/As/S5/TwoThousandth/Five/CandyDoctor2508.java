package Acmicpc.As.S5.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyDoctor2508 {
	static char[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), r = 0, c = 0, res = 0;
		String str = null;
		
		while(T-- > 0) {
			br.readLine();
			str = br.readLine();
			r = Integer.parseInt(str.split(" ")[0]);
			c = Integer.parseInt(str.split(" ")[1]);
			arr = new char[r][c];
			res = 0;
			
			for (int i = 0; i < arr.length; i++) {
				str = br.readLine();
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length-2; j++) {
					if (arr[i][j] == '>' && arr[i][j+1] == 'o' && arr[i][j+2] == '<') res++;
				}
			}
			for (int i = 0; i < arr.length-2; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == 'v' && arr[i+1][j] == 'o' && arr[i+2][j] == '^') res++;
				}
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
