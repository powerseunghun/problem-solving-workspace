package Acmicpc.As.B2.TenThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JogodeEstratégia13604 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int j = Integer.parseInt(str.split(" ")[0]);
		int R = Integer.parseInt(str.split(" ")[1]), max = 0, res = 0;
		arr = new int[j+1];
		
		for (int i = 0; i < R; i++) {
			for (int k = 1, v = 0; k <= j; k++) {
				arr[k] += Integer.parseInt(st.nextToken());
				
				if (arr[k] >= max) {
					max = arr[k];
					res = k;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
