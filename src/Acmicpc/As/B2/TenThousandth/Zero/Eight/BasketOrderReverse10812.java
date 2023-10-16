package Acmicpc.As.B2.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketOrderReverse10812 {
	static int[] arr = null, arr2 = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int l = 0, r = 0, k = 0, idx = 0;
		
		arr = new int[N];
		arr2 = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
		}
		
		while(M-- > 0) {
			str = br.readLine();
			l = Integer.parseInt(str.split(" ")[0])-1;
			r = Integer.parseInt(str.split(" ")[1])-1;
			k = Integer.parseInt(str.split(" ")[2])-1;
			idx = l;
			for (int i = 0; i < r-l+1; i++) {
				if(k+i <= r){ 
	                arr2[i+l] = arr[k+i];
	            }else{
	                arr2[i+l] = arr[idx++];
	            }
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr2[i] != 0) {
					arr[i] = arr2[i];
				}
			}
		}
		for (int el : arr) {
			sb.append(el + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
