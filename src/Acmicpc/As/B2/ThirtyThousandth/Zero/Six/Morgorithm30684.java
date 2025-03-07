package Acmicpc.As.B2.ThirtyThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Morgorithm30684 {
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			if (str.length() != 3) continue;
			list.add(str);
		}
		
		Collections.sort(list);
		System.out.println(list.get(0));
		br.close();
	}
}
