package Acmicpc.As.B4.TwentyThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZOAC23971 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int H = Integer.parseInt(tmp.split(" ")[0]);
		int W = Integer.parseInt(tmp.split(" ")[1]);
		int N = Integer.parseInt(tmp.split(" ")[2]);
		int M = Integer.parseInt(tmp.split(" ")[3]);
		
		System.out.println((int)(Math.ceil((double)H/(N+1)) * Math.ceil((double)W/(M+1))));
		br.close();
	}
}
