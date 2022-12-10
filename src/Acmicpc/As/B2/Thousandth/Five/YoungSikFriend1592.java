package Acmicpc.As.B2.Thousandth.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YoungSikFriend1592 {
	static int[] arr = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int L = Integer.parseInt(tmp.split(" ")[2]), res = 0, idx = 1;
		arr = new int[N+1];
		arr[1] = 1;
		
		while (arr[idx] != M) {
			if (arr[idx] % 2 == 0) {
				idx += L%N;
				idx -= idx > N ? N : 0;
			}
			else {
				idx -= L%N;
				idx += idx < 1 ? N : 0;
			}
			arr[idx]++;
			res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
