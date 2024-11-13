package Acmicpc.As.B5.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LoveIsKoreaUniversity32384 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		
		while(N-- > 0) {
			list.add("LoveisKoreaUniversity");
		}
		
		System.out.println(String.join(" ", list));
		br.close();
	}
}
