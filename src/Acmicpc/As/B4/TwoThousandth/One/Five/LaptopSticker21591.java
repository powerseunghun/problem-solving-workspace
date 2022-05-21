package Acmicpc.As.B4.TwoThousandth.One.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LaptopSticker21591 {
	static int[] arr = new int[4];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if (arr[0]-2 >= arr[2] && arr[1]-2 >= arr[3]) System.out.println("1");
		else System.out.println("0");
		
		br.close();
	}
}
