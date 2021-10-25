package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeA4Paper {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long N = Long.parseLong(tmp.split(" ")[0]);
		long M = Integer.parseInt(tmp.split(" ")[1]);
		long toWidth = (N/40) * (M/20);
		long toHeight = (M/40) * (N/20);
		long ex = (N/40) * (M/40) * 2;
		
		System.out.println(toWidth+toHeight - ex);
	}
}
