package Acmicpc.As.B4.TenThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TeamDivide13866 {
	static int[] arr = new int[4];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		System.out.println(Math.abs((arr[0]+arr[3])-(arr[1]+arr[2])));
		br.close();
	}
}
