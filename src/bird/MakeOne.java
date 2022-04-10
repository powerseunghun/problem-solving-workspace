package bird;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeOne {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		// 인덱스 숫자 만드는 연산 갯수
		int[] arr = new int[X+1];
		Arrays.fill(arr, 0);
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+1;
			if (i % 3 == 0) arr[i] = Math.min(arr[i], arr[i/3]+1);
			if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i/2]+1);
		}
		
		System.out.println(arr[X]);
		br.close();
	}
}
