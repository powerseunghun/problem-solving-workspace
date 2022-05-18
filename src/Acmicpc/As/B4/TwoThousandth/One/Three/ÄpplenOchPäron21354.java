package Acmicpc.As.B4.TwoThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ÄpplenOchPäron21354 {
	static int[] arr = new int[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i == 0 ? 7 : 13) * Integer.parseInt(st.nextToken()); 
		}
		
		if (arr[0] > arr[1]) System.out.println("Axel");
		else if (arr[1] > arr[0]) System.out.println("Petra");
		else System.out.println("lika");
		br.close();
		
	}
}
