package Acmicpc.As.B3.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GarbledMessage5362 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while((str = br.readLine()) != null) {
			sb.append(str.replaceAll("iiing", "th")).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
