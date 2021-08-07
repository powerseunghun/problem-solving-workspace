package Acmicpc.GreedyAlgorithm.TenThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Cow {
	private int in;
	private int out;
	public Cow() {
		this.in = 0;
		this.out = 0; 
	}
	public Cow(int i, int o) {
		this.in = i;
		this.out = o;
	}
	
	public int getIn() {
		return this.in;
	}
	public int getOut() {
		return this.out;
	}
}
public class CowBridge14469 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), in = 0, out = 0, sum = 0;
		Cow[] cows = new Cow[N];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			in = Integer.parseInt(tmp.split(" ")[0]);
			out = Integer.parseInt(tmp.split(" ")[1]);
			cows[i] = new Cow(in, out);
		}
		Arrays.sort(cows, new Comparator<Cow>() {
			@Override
			public int compare(Cow o1, Cow o2) {
				if (o1.getIn() != o2.getIn()) {
					return o1.getIn() - o2.getIn();
				}
				else return o2.getOut() - o2.getOut();
			}
		});
		
		for (Cow c : cows) {
			sum = Math.max(c.getIn(), sum) +c.getOut();
		}
		System.out.println(sum);
	}
}
