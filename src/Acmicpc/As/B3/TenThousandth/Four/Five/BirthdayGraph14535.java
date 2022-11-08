package Acmicpc.As.B3.TenThousandth.Four.Five;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BirthdayGraph14535 {
	static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	static int[] arr = new int[12];
	public static void main(String[] args) throws NumberFormatException, IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = 0, w = 1;
		
		while(true) {
			N = sc.nextInt();
			if (N == 0) break;
			sc.nextLine();
			
			Arrays.fill(arr, 0);
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(sc.nextLine());
				st.nextToken();
				arr[Integer.parseInt(st.nextToken())-1]++;
				
			}
			sb.append("Case #" + (w++) + ":\n");
			for (int i = 0; i < months.length; i++) {
				sb.append(months[i] + ":");
				for (int j = 0; j < arr[i]; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
	}
}
