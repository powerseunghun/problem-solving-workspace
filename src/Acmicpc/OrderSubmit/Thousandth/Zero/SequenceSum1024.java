package Acmicpc.OrderSubmit.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SequenceSum1024 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int L = Integer.parseInt(str.split(" ")[1]), x = 0, t = 0, l = 0;
		
		// Lx + (1+2+...L-1)
		// N Lx + t / (N-t)/L
		for (int i = L; i <= 100; i++) {
	        t = (i - 1)*i / 2;
	        if ((N - t) % i == 0 && (N-t)/i>=0) {
	            x = (N - t) / i;
	            l = i;
	            break;
	        }
	    }
		if (x == -1) {
			System.out.println(x);
		}
		else {
			for (int i = 0; i < l; i++) {
				System.out.print((x+i) + " ");
			}
		}
		
		br.close();
	}
}
