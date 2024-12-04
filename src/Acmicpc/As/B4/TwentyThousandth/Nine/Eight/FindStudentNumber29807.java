package Acmicpc.As.B4.TwentyThousandth.Nine.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindStudentNumber29807 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[5];
		
		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		res += (arr[0]>arr[2] ? 508 : 108) * Math.abs(arr[0]-arr[2]);
		res += (arr[1]>arr[3] ? 212 : 305) * Math.abs(arr[1]-arr[3]);
		res += arr[4]*707;
		
		System.out.println(res * 4763);
		br.close();
	}
}
