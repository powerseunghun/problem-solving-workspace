package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NineTwoPM2742 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= Integer.parseInt(tmp.split(" ")[0]); i++) {
			list.add(Integer.parseInt(tmp.split(" ")[i]));
		}
		Collections.sort(list, Collections.reverseOrder());
		
		for (int i = 0, idx = (int) (Math.floor(1+(list.size()/2))-1); i < list.size(); i++) {
			if (i == 0) {
				System.out.print(list.get(idx));
			}
			else if (i == idx) System.out.print(list.get(0));
			else System.out.print(list.get(i));
			System.out.print(" ");
		}
	}
}
