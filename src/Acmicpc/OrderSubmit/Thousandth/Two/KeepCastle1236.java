package Acmicpc.OrderSubmit.Thousandth.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeepCastle1236 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int rowCount = 0, colCount = 0;
		char[][] arr = new char[N][M];
		
		for (int i = 0, rc = 0; i < arr.length; i++, rc = 0) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == '.') rc++;
			}
			if (rc == M) rowCount++;
		}
		
		for (int i = 0, cc = 0; i < arr[0].length; i++, cc = 0) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] == '.') cc++;
			}
			if (cc == N) colCount++;
		}
		
		System.out.println(Math.max(rowCount, colCount));
		br.close();
	}
}
