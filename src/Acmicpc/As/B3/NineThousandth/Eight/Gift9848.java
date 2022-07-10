package Acmicpc.As.B3.NineThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gift9848 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), g = 0;
		int t = Integer.parseInt(tmp.split(" ")[1]), beforeTime = Integer.parseInt(br.readLine());
		
		for (int i = 0, curTime = 0; i < n-1; i++) {
			curTime = Integer.parseInt(br.readLine());
			if (curTime + t <= beforeTime) g++;
			beforeTime = curTime;
		}
		
		System.out.println(g);
		br.close();
	}
}
