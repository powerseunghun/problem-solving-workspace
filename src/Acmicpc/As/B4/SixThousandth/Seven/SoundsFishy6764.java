package Acmicpc.As.B4.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoundsFishy6764 {
	static int[] arr = new int[4];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		if ((arr[0] == arr[1]) && (arr[2] == arr[3])) {
			System.out.println("Fish At Constant Depth");
			return;
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i+1]) count--;
			if (arr[i] < arr[i+1]) count++;
		}
		
		switch(count) {
		case 3:
			System.out.println("Fish Rising");
			break;
		case -3:
			System.out.println("Fish Diving");
			break;
		default:
			System.out.println("No Fish");
			break;
		}
		br.close();
	}
}
