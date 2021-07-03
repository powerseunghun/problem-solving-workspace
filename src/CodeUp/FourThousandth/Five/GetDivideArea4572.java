package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class GetDivideArea4572 {
	static int[][] arr = null;
	static int area = 0, count = 0;
	static void find(int x, int y, int M, int N) {
		if (x < 0 || y < 0 || x >= M || y >= N) {
			return;
		}
		if (arr[x][y] == 1) return;
		count++;
		arr[x][y] = 1;
		find(x, y+1, M, N);
		find(x+1, y, M, N);
		find(x, y-1, M, N);
		find(x-1, y, M, N);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int M = Integer.parseInt(tmp.split(" ")[0]), N = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		arr = new int[M][N];
		int[] cnts = null;
		ArrayList<Integer> cntList = new ArrayList<>();
		
		for (int i = 0; i < K; i++) {
			tmp = br.readLine();
			y1 = Integer.parseInt(tmp.split(" ")[0]);
			x1 = Integer.parseInt(tmp.split(" ")[1]);
			y2 = Integer.parseInt(tmp.split(" ")[2]);
			x2 = Integer.parseInt(tmp.split(" ")[3]);
			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					arr[x][y] = 1;
				}
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 0) {
					count = 0;
					area++;
					find(i, j, M, N);
					cntList.add(count);
				}
			}
		}
		cnts = new int[cntList.size()];
		for (int i = 0; i < cnts.length; i++) {
			cnts[i] = cntList.get(i);
		}
		Arrays.sort(cnts);
		
		System.out.println(area);
		for (int el : cnts) {
			System.out.print(el + " ");
		}
	}
}
