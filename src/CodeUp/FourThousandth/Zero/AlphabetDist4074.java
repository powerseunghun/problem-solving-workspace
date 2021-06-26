package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AlphabetDist4074 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char alp = br.readLine().charAt(0);
		int sum = 0;
		ArrayList<Integer> pos = new ArrayList<>();
		
		for (int i = 0; i < str.length(); i++) {
			if (alp >= 'a' && alp <= 'z') {
				if (str.charAt(i) == alp || str.charAt(i) == (char)(alp-32)) pos.add(i+1);
			}
			else if (alp >= 'A' && alp <= 'Z') {
				if (str.charAt(i) == alp || str.charAt(i) == (char)(alp+32)) pos.add(i+1);
			}
			
		}
		
		for (int i = 1; i < pos.size(); i++) {
			sum += pos.get(i) - pos.get(i-1);
		}
		System.out.println(pos.size());
		System.out.println(sum);
	}
}
