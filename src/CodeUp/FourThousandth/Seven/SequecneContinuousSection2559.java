package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequecneContinuousSection2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), K = Integer.parseInt(tmp.split(" ")[1]), max = Integer.MIN_VALUE;
		int[] arr = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0, val = 0; i <= N-K; i++) {
			val = arr[i+K] - arr[i];
			max = max >= val ? max : val;
		}
		
		System.out.println(max);
	}
}
