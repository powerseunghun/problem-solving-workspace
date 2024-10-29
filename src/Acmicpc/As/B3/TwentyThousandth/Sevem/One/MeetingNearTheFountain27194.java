package Acmicpc.As.B3.TwentyThousandth.Sevem.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MeetingNearTheFountain27194 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int t = Integer.parseInt(str.split(" ")[1]);
		int m = Integer.parseInt(br.readLine());
		str = br.readLine();
		int x = Integer.parseInt(str.split(" ")[0]);
		int y = Integer.parseInt(str.split(" ")[1]);
		int t1 = (x*(n-m) + y*m + x*y*60-1) / (x*y*60) - t;
		
		System.out.println(Math.max(t1, 0));
		br.close();
	}
}
