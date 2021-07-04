package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4696 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), l = 0, r = 0, mid = 0;
		int sum = Integer.MAX_VALUE, tmp = 0, a = 0, b = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr.length; i++) {
			l = i+1;
			r = n-1;
			while(l <= r) {
				mid = (l+r)/2;
				tmp = arr[i] + arr[mid];
				if (Math.abs(tmp) < sum) {
					a = arr[i];
					b = arr[mid];
					sum = Math.abs(tmp);
				}
				
				if (tmp < 0) l = mid+1;
				else r = mid-1;
			}
		}
		System.out.println(a + " " + b);
	}
}
