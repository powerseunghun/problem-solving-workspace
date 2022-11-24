package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NiceRaises25812 {
	static int[] arr = new int[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int T = Integer.parseInt(tmp.split(" ")[0]);
		int R = Integer.parseInt(tmp.split(" ")[1]), val = 0, idx = 0;
		
		while(T-- > 0) {
			val = Integer.parseInt(br.readLine());
			if (val+R == val*2) continue;
			idx = val + R > val * 2 ? 0 : 1;
			arr[idx]++;
		}
		
		System.out.println(arr[0] == arr[1] ? 0 : arr[0] > arr[1] ? 1 : 2);
		br.close();
	}
}
