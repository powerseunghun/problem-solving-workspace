package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindTreasure2631 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		int cnt = 0, val = 0;
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0, sum = 0; i < arr.length; i++) {
			val = arr[i];
			if (val >= k) {
				cnt = val == k ? cnt+1 : cnt;
				continue;
			}
			
			else {
				for (int j = i+1; j < arr.length; j++) {
					val += arr[j];
					if (val > k) break;
					else if (val == k) {
						cnt++;
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
