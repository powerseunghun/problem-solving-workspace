package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeNWithPlusMinus2748 {
	static int[] arr = null;
	static int count = 0;
	static void bt(int n, int depth, int tmp, int m) {
		if (n == depth) {
//			System.out.println(tmp);
			if (tmp == m) count++;
			return;
		}
		bt(n, depth+1, tmp+arr[depth], m);
		bt(n, depth+1, tmp-arr[depth], m);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		String tmp = br.readLine();
		if (tmp == null || tmp.length() == 0) {
			System.out.println("0");
			return;
		}
		StringTokenizer st = new StringTokenizer(tmp);
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		bt(n, 0, 0, m);
		System.out.println(count);
	}
}
