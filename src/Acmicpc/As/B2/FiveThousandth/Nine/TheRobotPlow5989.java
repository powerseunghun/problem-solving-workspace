package Acmicpc.As.B2.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheRobotPlow5989 {
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int X = Integer.parseInt(tmp.split(" ")[0]);
		int Y = Integer.parseInt(tmp.split(" ")[1]);
		int L = Integer.parseInt(tmp.split(" ")[2]), cnt = 0;
		arr = new char[Y][X];
		
		for (int i = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0; i < L; i++) {
			tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			x2 = Integer.parseInt(tmp.split(" ")[2]);
			y2 = Integer.parseInt(tmp.split(" ")[3]);
			
			for (int j = x1-1; j <= x2-1; j++) {
				for (int k = y1-1; k <= y2-1; k++) {
					arr[k][j] = '*';
				}
			}
		}
		
		for (char[] cs : arr) {
			for (char c : cs) {
				if (c != '\u0000') cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
}
