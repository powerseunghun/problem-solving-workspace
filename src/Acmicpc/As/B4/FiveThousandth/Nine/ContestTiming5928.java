package Acmicpc.As.B4.FiveThousandth.Nine;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class ContestTiming5928 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		res = arr[2]-11+(arr[1]-11)*60+(arr[0]-11)*1440;
		
		System.out.println(res < 0 ? -1 : res);
		br.close();
	}
}
