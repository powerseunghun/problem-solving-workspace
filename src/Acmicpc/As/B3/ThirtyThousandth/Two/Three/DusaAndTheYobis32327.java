package Acmicpc.As.B3.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DusaAndTheYobis32327 {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int D = Integer.parseInt(br.readLine());
		
		while((str = br.readLine()) != null) {
			list.add(Integer.parseInt(str));
		}
		
		for (Integer v : list) {
			if (D <= v) break;
			D += v;
		}
		System.out.println(D);
		br.close();
	}
}
