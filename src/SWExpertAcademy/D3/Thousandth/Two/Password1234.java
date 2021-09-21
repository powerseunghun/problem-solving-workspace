package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Password1234 {
	static boolean check(ArrayList<Character> list) {
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i) == list.get(i+1)) return true;
		}
		return false;
 	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Character> list = new ArrayList<>();
		String tmp = null;
		
		for (int i = 1; i <= 10; i++) {
			sb.append("#" + i + " ");
			list.clear();
			tmp = br.readLine();
			tmp = tmp.split(" ")[1];
			for (int j = 0; j < tmp.length(); j++) {
				list.add(tmp.charAt(j));
			}
			while (check(list)) {
				for (int j = 0; j < list.size()-1; j++) {
					if (list.get(j) == list.get(j+1)) {
						list.remove(j);
						list.remove(j);
					}
				}
			}
			for (int j = 0; j < list.size(); j++) {
				sb.append(list.get(j));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
