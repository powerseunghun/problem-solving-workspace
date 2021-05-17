package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConwaySequence2027 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), idx = 0;
		ArrayList<Integer> seq = new ArrayList<>();
		seq.add(1);
		seq.add(1);
		
		for (int i = 0; i < n-2; i++) {
			idx = seq.get(seq.size()-1);
			seq.add(seq.get(idx-1) + seq.get(seq.size()-idx)); 
		}
		System.out.println(seq.get(n-1));
	}
}
