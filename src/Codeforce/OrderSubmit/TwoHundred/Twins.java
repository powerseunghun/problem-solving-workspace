package Codeforce.OrderSubmit.TwoHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Twins {
	static int res = 0;
	static int[] arr = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), twinSum = 0, mySum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			twinSum += arr[i];
		}
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i >= 0; i--) {
			mySum += arr[i];
			twinSum -= arr[i];
			res++;
			if (mySum > twinSum) break; 
		}
		
		System.out.println(res);
		br.close();
	}
}
