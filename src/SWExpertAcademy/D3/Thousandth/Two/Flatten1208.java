package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Flatten1208 {
	static int getDiff(int[] arr, int dump) {
		int max = 0, min = 0, maxIdx = 0, minIdx = 0;
		for (int t = 0; t < dump+1; t++) {
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
					maxIdx = i;
				}
				if (arr[i] < min) {
					min = arr[i];
					minIdx = i;
				}
			}
			arr[maxIdx]--;
			arr[minIdx]++;
		}
		return max-min;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int[] arr = new int[100];
		int dump = 0;
		
		for (int i = 1; i <= 10; i++) {
			dump = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			sb.append("#" + i + " " + getDiff(arr, dump) + "\n");
		}
		System.out.print(sb.toString());
	}
}
