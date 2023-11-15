package Acmicpc.As.B5.TenThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name15312 {
	static final int[] w = {3,2,1,2,3,3,2,3,3,2,2,1,2,2,1,2,2,2,1,2,1,1,1,2,2,1};
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		arr = new int[str1.length()+str2.length()];
		int len = arr.length;
		
		
        for (int i=0; i < arr.length-1; i+=2) {
        	arr[i]   = w[str1.charAt(i/2)-65];
            arr[i+1] = w[str2.charAt(i/2)-65];
        }
        
        while (len > 2) {
            for (int i = 0; i < len-1; i++) {
            	arr[i] = (arr[i] + arr[i+1]) % 10;
            }
            len--;
            arr[len] = 0;
        }
        
        System.out.println(String.valueOf(arr[0]) + String.valueOf(arr[1]));
        br.close();
	}
}
