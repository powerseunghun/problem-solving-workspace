package Acmicpc.NumberTheory.TenThosuandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaseConversion11576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		long sum = 0;
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		br.readLine();
		String[] strs = br.readLine().split(" ");
		
		for (int i = strs.length-1, idx = 0; i >= 0; i--) {
			sum += Integer.parseInt(strs[i]) * Math.pow(A, idx++);
		}
		
		while (sum != 0) {
			list.add((int)(sum % B));
			sum /= B;
		}
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}
}
