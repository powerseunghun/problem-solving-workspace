package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MoneyCalculation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		int K = Integer.parseInt(br.readLine()), sum = 0, val = 0;
		for (int i = 0; i < K; i++) {
			val = Integer.parseInt(br.readLine());
			if (val == 0 && !list.isEmpty()) {
				list.remove(list.size()-1);
				continue;
			}
			list.add(val);
		}
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
		br.close();
	}
}
