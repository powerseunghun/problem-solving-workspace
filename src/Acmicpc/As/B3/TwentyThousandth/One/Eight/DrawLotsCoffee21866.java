package Acmicpc.As.B3.TwentyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DrawLotsCoffee21866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		StringTokenizer st = new StringTokenizer(br.readLine());
		int val = 0, sum = 0;
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			val = Integer.parseInt(st.nextToken());
			sum += val;
			if (val > arr[i]) {
				flag = true;
				break;
			}
		}
		
		System.out.println(flag ? "hacker" : sum >= 100 ? "draw" : "none");
		br.close();
	}
}
