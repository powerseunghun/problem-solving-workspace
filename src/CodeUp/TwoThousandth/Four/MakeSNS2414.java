package CodeUp.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MakeSNS2414 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		String findName = null;
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		findName = br.readLine();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).split(",")[0].equals(findName)) {
				System.out.println(list.get(i).split(",")[2]);
			}
		}
	}
}
