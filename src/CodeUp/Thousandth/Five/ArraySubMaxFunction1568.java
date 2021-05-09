package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraySubMaxFunction1568 {
	static int f(int[] arr, int s, int e) {
		int max = arr[s-1];
		for (int i = s; i <= e-1; i++) {
			max = arr[i] >= max ? arr[i] : max;
		}
		
		for (int i = s-1; i <= e-1; i++) {
			if (arr[i] == max) return i+1;
		}
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		String tmp = null;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		tmp = br.readLine();
		
		System.out.println(f(arr, Integer.parseInt(tmp.split("")[0]), Integer.parseInt(tmp.split(" ")[1])));
		
	}
}
