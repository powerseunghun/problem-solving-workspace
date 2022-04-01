package Acmicpc.OrderSubmit.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class HideAndSeek17071 {
	static int res = 0;
	static int[] weight = {-1, 1, 2};
	static int[][] check = new int[2][500001];
	static void init() {
		for (int i = 0; i < check.length; i++) {
			Arrays.fill(check[i], -1);
		}
	}
	static void bfs(int N, int K) {
		Queue<Integer> q = new LinkedList<>();
		q.add(N);
		check[0][N] = 0;
		
		int qSize = 0, curPos = 0, sisPos = 0;
		while (!q.isEmpty()) {
			qSize = q.size();
			res++;
			
			for (int i = 0; i < qSize; i++) {
				curPos = q.poll();
				for (int j = 0, nx = 0; j < weight.length; j++) {
					nx = j == weight.length-1 ? curPos * weight[j] : curPos + weight[j];
//					System.out.println("nx : " + nx);
//					try {
//						Thread.sleep(1500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					if (nx < 0 || nx > 500000) continue;
					if (check[res%2][nx] == -1) {
						q.add(nx);
						check[res%2][nx] = res;
					}
				}
			}
			// sisPos = a1 = K, d = 1
			sisPos = K + (res*(res+1) / 2);
//			System.out.println("sisPos : " + sisPos);
			if (sisPos > 500000 || check[res%2][sisPos] != -1) {
				res = sisPos > 500000 ? -1 : res;
				return;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		if (N == K) {
			System.out.println(0);
			return;
		}
		
		init();
		bfs(N, K);
		
		System.out.println(res);
		br.close();
	}
}
