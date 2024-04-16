package Acmicpc.As.B3.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EscapeSchool31669 {
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), res = -1;
		boolean flag = false;
		arr = new char[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < M && res < 0; i++) {
			flag = true;
			for (int j = 0; j < N && res < 0; j++) {
				if (arr[j][i] == 'O') flag = false; 
			}
			if (flag) {
				res = i+1;
			}
		}
		
		System.out.println(res < 0 ? "ESCAPE FAILED" : res);
		br.close();
	}
}
