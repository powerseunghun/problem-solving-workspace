package SWExpertAcademy.D3.EightThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Zero8931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), K = 0, sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= T; i++) {
			K = Integer.parseInt(br.readLine());
			sum = 0;
			list.clear();
			for (int j = 0, val = 0; j < K; j++) {
				val = Integer.parseInt(br.readLine());
				switch(val) {
				case 0:
					list.remove(list.size()-1);
					break;
				default:
					list.add(val);
					break;
				}
			}
			for (int j = 0; j < list.size(); j++) {
				sum += list.get(j);
			}
			sb.append("#" + i + " " + sum + "\n");
		}
		System.out.print(sb.toString());
	}
}
