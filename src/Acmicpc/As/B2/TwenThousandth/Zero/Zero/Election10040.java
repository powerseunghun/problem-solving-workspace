package Acmicpc.As.B2.TwenThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Election10040 {
	static int[] arr = null;
	static Map<Integer, Integer> map = new HashMap<>();
	static void mapInit(int N) {
		for (int i = 1; i <= N; i++) {
			map.put(i, 0);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int max = Integer.MIN_VALUE, res = 0;
		
		mapInit(N);
		arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0, e = 0; i < M; i++) {
			e = Integer.parseInt(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] <= e) {
					map.put(j+1, map.get(j+1)+1);
					if (map.get(j+1) > max) {
						max = map.get(j+1);
						res = j+1;
					}
					break;
				}
			}
		}
		System.out.println(res);
		br.close();
	}
}
