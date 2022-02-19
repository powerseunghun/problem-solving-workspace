package Acmicpc.OrderSubmit.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sequence2491 {
	static int getLongSequenceLength(int[] arr) {
		int max = 1;
		int[] length = new int[arr.length];
		
		length[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			length[i] = arr[i] >= arr[i-1] ? length[i-1]+1 : 1;
			max = Math.max(max, length[i]);
		}
		Arrays.fill(length, 0);
		
		length[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			length[i] = arr[i] <= arr[i-1] ? length[i-1]+1 : 1;
			max = Math.max(max, length[i]);
		}
		
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		System.out.println(getLongSequenceLength(arr));
		br.close();
	}
}
