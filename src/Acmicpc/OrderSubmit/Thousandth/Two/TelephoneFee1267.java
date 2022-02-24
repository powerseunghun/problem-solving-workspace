package Acmicpc.OrderSubmit.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TelephoneFee1267 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum1 = 0, sum2 = 0;;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int el : arr) {
			sum1 += ((el / 30) + 1) * 10;
			sum2 += ((el / 60) + 1) * 15;
		}
		
		if (sum1 > sum2) {
			System.out.print("M ");
		}
		else if (sum1 < sum2) {
			System.out.print("Y ");
		}
		else System.out.print("Y M ");
		System.out.println(Math.min(sum1, sum2));
		br.close();
	}
}
