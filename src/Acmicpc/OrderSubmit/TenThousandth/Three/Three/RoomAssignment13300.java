package Acmicpc.OrderSubmit.TenThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomAssignment13300 {
	static int[][] arr = new int[2][7];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), cnt = 0;
		
		for (int i = 0, S = 0, Y = 0; i < N; i++) {
			tmp = br.readLine();
			S = Integer.parseInt(tmp.split(" ")[0]);
			Y = Integer.parseInt(tmp.split(" ")[1]);
			arr[S][Y]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] >= K) {
					cnt += (arr[i][j] / K);
					if (arr[i][j] % K != 0) {
						cnt++;
					}
					continue;
				}
				if (arr[i][j] == 0) continue;
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
