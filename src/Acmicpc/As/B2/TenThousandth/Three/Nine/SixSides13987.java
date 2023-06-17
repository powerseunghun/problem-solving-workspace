package Acmicpc.As.B2.TenThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SixSides13987 {
    static int[] arr1 = new int[6];
    static int[] arr2 = new int[6];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int t = 0, w = 0;
        
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            if (i == 0) {
                for (int j = 0; j < arr1.length; j++) {
                    arr1[j] = Integer.parseInt(st.nextToken());
                }
            }
            else {
                for (int j = 0; j < arr2.length; j++) {
                    arr2[j] = Integer.parseInt(st.nextToken());
                }
            }
        }
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) w++;
                if (arr1[i] != arr2[j]) t++; 
            }
        }
		
		System.out.println(String.format("%.5f", (double)w/t));
		br.close();
	}
}
