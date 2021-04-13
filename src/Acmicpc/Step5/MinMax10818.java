package Acmicpc.Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax10818 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1000001, min = 10000001, tmp = 0;
		StringTokenizer st = null;
		
		br.readLine();
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			if (tmp > max) max = tmp;
			if (tmp < min) min = tmp;
		}
		
		System.out.println(min + " " + max);
	}
}
