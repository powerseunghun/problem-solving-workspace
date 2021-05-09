package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraySubsumFunction1567 {
	static long f(long[] arr, int s, int e) {
		long sum = 0;
		for (int i = s-1; i <= e-1; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] arr = new long[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		String tmp = null;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		tmp = br.readLine();
		
		System.out.println(f(arr, Integer.parseInt(tmp.split(" ")[0]), Integer.parseInt(tmp.split(" ")[1])));
	}
}
