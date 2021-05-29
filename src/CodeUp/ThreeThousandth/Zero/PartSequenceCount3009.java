package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PartSequenceCount3009 {
	static int[] arr = null;
	static int count = 0;
	static void bt(int sum, int S, int depth, int N) {
		if (depth >= N) return;
		sum += arr[depth];
		
		if (sum == S) {
			count++;
		}
		bt(sum, S, depth+1, N);
		bt(sum-arr[depth], S, depth+1, N);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int S = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		bt(0, S, 0, N);
		
		System.out.println(count);
		
	}
}
