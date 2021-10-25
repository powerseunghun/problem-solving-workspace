package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		long sum = 0, min = 1000000001;
		long[] city = new long[N], dist = new long[N-1];
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			switch(i) {
			case 0:
				for (int j = 0; j < N-1; j++) {
					dist[j] = Integer.parseInt(st.nextToken());
				}
				break;
			case 1:
				for (int j = 0; j < N; j++) {
					city[j] = Integer.parseInt(st.nextToken());
				}
				break;
			}
		}
		
		for (int i = 0; i < city.length-1; i++) {
			if (city[i] <= min) {
				min = city[i];
			}
			else {
				city[i] = min;
			}
			sum += (min * dist[i]);
		}
		System.out.println(sum);
	}
}
