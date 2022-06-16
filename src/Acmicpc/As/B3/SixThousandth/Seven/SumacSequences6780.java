package Acmicpc.As.B3.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SumacSequences6780 {
	static List<Integer> list = new ArrayList<>();
	static void func() {
		for (int i = 2, val = 0; ; i++) {
			val = list.get(i-2) - list.get(i-1);
			if (val < 0) break;
			list.add(val);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 2; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		func();
		
		System.out.println(list.size());
		br.close();
	}
}
