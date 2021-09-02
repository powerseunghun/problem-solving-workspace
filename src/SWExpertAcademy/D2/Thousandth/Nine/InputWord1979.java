package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputWord1979 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0, ans = 0, cnt = 0;
		int[][] arr = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			ans = 0;
			cnt = 0;
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N][N];
			for (int j = 0; j < arr.length; j++) {
				tmp = br.readLine();
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = Integer.parseInt(tmp.split(" ")[k]);
				}
			}
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					if (arr[j][k] == 1) cnt++;
					if (arr[j][k] == 0 || k == N-1) {
						if (cnt == K) ans++;
						cnt = 0;
					}
				}
			}
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					if (arr[k][j] == 1) cnt++;
					if (arr[k][j] == 0 || k == N-1) {
						if (cnt == K) ans++;
						cnt = 0;
					}
				}
			}
			sb.append("#" + i + " " + ans + "\n");
		}
		System.out.print(sb.toString());
	}
}
