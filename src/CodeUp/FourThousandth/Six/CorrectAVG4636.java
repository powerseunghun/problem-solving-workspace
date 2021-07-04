package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CorrectAVG4636 {
	static double getCutAvg(int N, int K, double[] arr) {
		double sum = 0;
		for (int i = 0+K; i < N-K; i++) {
			sum += arr[i];
		}
		return sum/(N-K*2);
	}
	static double getCorAvg(int N, int K, double[] arr) {
		double value = arr[K], sum = 0;
		for (int i =0; i < K; i++) {
			arr[i] = value;
		}
		value = arr[N-1-K];
		for (int i = N-1; i > N-1-K; i--) {
			arr[i] = value;
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum/N;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), K = Integer.parseInt(tmp.split(" ")[1]);
		double[] arr = new double[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		Arrays.sort(arr);
		
		System.out.printf("%.2f\n", getCutAvg(N, K, arr));
		System.out.printf("%.2f\n", getCorAvg(N, K, arr));
	}
}
