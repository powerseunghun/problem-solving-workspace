package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomBatch4866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] stds = new int[5];
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), K = Integer.parseInt(tmp.split(" ")[1]);
		int s = 0, y = 0, count = 0;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			if (y == 1 || y == 2) stds[0]++;
			else if (s == 0 && (y == 3 || y == 4)) stds[1]++;
			else if (s == 1 && (y == 3 || y == 4)) stds[2]++;
			else if (s == 0 && (y == 5 || y == 6)) stds[3]++;
			else stds[4]++;
		}
		for (int el : stds) {
			count += Math.ceil(el / (double)K);
		}
		System.out.println(count);
	}
}
