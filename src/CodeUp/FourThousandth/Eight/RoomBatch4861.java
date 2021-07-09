package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomBatch4861 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] room = new int[2][7];
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), count = 0;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			room[Integer.parseInt(tmp.split(" ")[0])][Integer.parseInt(tmp.split(" ")[1])]++;
		}
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0 ; j < room[i].length; j++) {
				count += room[i][j] / K;
				if (room[i][j] % K != 0) count++;
			}
		}
		
		System.out.println(count);
	}
}
