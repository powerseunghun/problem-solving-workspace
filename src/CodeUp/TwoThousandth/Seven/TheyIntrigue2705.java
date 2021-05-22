package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheyIntrigue2705 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		String tmp = br.readLine();
		int L = Integer.parseInt(tmp.split(" ")[0]);
		int T = Integer.parseInt(tmp.split(" ")[1]), cnt = 1;
		int s = 0, e = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i-1]) cnt++;
			else cnt = 1;
			if (cnt >= L) {
				flag = true;
				s = arr[i-1];
				e = s + T - 1;
				break;
			}
		}
		if (!flag) {
			System.out.println(arr.length * 10000);
			return;
		}
		
		cnt = 0;
		for (int el : arr) {
			if (!(el >= s && el <= e)) {
				cnt++;
			}
		}
		
		System.out.println(10000 * cnt);
	}
}
