package Acmicpc.As.B2.TenThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Presents13771 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Double> list = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			list.add(Double.parseDouble(br.readLine()));
		}
		Collections.sort(list);
		
		System.out.println(String.format("%.2f", list.get(1)));
		br.close();
	}
}
