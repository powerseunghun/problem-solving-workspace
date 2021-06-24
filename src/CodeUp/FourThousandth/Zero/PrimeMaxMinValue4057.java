package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeMaxMinValue4057 {
	static int[] arr = new int[100001];
	static void init() {
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = 2 * i; j < arr.length; j+=i) {
				arr[j] = 0;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int tmpA = Integer.parseInt(tmp.split(" ")[0]);
		int tmpB = Integer.parseInt(tmp.split(" ")[1]);
		int a = Math.min(tmpA, tmpB), b = Math.max(tmpA, tmpB);
		int max = a-1, min = b+1, count = 0;
		init();
		
		for (int i = a; i <= b; i++) {
			if (arr[i] != 0) {
				count++;
				max = max >= arr[i] ? max : arr[i];
				min = arr[i] >= min ? min : arr[i];
			}
		}
		System.out.println(count);
		System.out.println(max + min);
	}
}
