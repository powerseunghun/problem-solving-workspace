package Acmicpc.As.B5.TwentyThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HIARC28444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h = Integer.parseInt(str.split(" ")[0]);
		int i = Integer.parseInt(str.split(" ")[1]);
		int a = Integer.parseInt(str.split(" ")[2]);
		int r = Integer.parseInt(str.split(" ")[3]);
		int c = Integer.parseInt(str.split(" ")[4]);
		
		System.out.println(h*i-a*r*c);
		br.close();
	}
}
