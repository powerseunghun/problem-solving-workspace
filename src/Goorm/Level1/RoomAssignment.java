package Goorm.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomAssignment {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] room = new int[2][7];
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), count = 0;
		
		for (int i = 0, s = 0, y = 0; i < N; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			room[s][y]++;
		}
		
		for (int i = 1; i < room.length; i++) {
			for (int j = 1; j < room[i].length; j++) {
				count += room[i][j] / K;
				if (room[i][j] % K != 0) count++;
			}
		}
		System.out.println(count);
	}
}
