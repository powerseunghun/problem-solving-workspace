package Acmicpc.OrderSubmit.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExamManager13458 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), B = 0, C = 0;
		long ans = 0;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		for (int i = 0, val = 0; i < arr.length; i++) {
			if (arr[i] <= B) {
				ans++;
				continue;
			}
			val = arr[i] - B;
			ans++;
			ans += val % C == 0 ? (val / C) : (val / C) + 1;
		}
		
		System.out.println(ans);
		br.close();
	}
}
