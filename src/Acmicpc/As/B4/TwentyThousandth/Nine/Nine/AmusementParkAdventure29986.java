package Acmicpc.As.B4.TwentyThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AmusementParkAdventure29986 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.split(" ")[0]);
		int h = Integer.parseInt(str.split(" ")[1]), res = 0;
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			res = h >= arr[i] ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
