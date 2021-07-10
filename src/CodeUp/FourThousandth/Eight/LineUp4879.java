package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LineUp4879 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(tmp.split(" ")[0]), M = Integer.parseInt(tmp.split(" ")[1]);
		int tx = 0, ty = 0;
		int[] arr = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}
		
		for (int i = 1; i <= M; i++) {
			tmp = br.readLine();
			tx = Integer.parseInt(tmp.split(" ")[0]);
			ty = Integer.parseInt(tmp.split(" ")[1]);
			arr[tx]++;
			arr[ty]--;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				System.out.println("-1");
				return;
			}
			map.put(arr[i], 1);
			sb.append(arr[i] + " ");
		}
		System.out.println(sb.toString());
	}
}
