package Acmicpc.As.B3.TwentyThousandth.Seven.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Election27736 {
	static int[] arr = new int[3];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			switch(v) {
			case 1:
				arr[0]++;
				break;
			case -1:
				arr[1]++;
				break;
			default:
				arr[2]++;
				break;
			}
		}
		
		System.out.println(arr[2] >= (N%2 == 0 ? N/2 : N/2+1) 
				? "INVALID" 
				: (arr[1] > arr[0] || arr[0] == arr[1]) ? "REJECTED" : "APPROVED");
		br.close();
	}
}
