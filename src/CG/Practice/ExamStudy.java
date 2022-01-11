package CG.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ExamStudy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0, ans = 0;
		int[] arr = null;
		StringTokenizer st = null;
		String tmp = null;
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N];
			ans = 0;
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			for (int j = arr.length-1; j >= arr.length-K; j--) {
				ans += arr[j];
			}
			
			sb.append("Case #" + (i+1) + "\n");
			sb.append(ans + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
