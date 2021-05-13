package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgOfTen1707 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int[] arr = new int[10];
		int sum = 0, lCount = 0, hCount = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tmp.split(" ")[i]);
			sum += arr[i];
		}
		
		for (int el : arr) {
			hCount = el >= sum/10.0 ? hCount+1 : hCount;
			lCount = el < sum/10.0 ? lCount+1 : lCount;
		}
		
		System.out.println(sum / 10.0);
		System.out.println(hCount + " " + lCount);
	}
}
