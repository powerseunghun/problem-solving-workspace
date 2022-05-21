package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoftDrinking {
	static int[] arr = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), k = Integer.parseInt(tmp.split(" ")[1]);
		int l = Integer.parseInt(tmp.split(" ")[2]), c = Integer.parseInt(tmp.split(" ")[3]);
		int d = Integer.parseInt(tmp.split(" ")[4]), p = Integer.parseInt(tmp.split(" ")[5]);
		int nl = Integer.parseInt(tmp.split(" ")[6]), np = Integer.parseInt(tmp.split(" ")[7]), count = 0;
		
		arr[0] = k * l;
		arr[1] = c * d;
		arr[2] = p;
		
		while (arr[0] >= nl && arr[1] >= 1 && arr[2] >= np) {
			count++;
			arr[0] -= nl;
			arr[1] -= 1;
			arr[2] -= np;
		}
		
		System.out.println(count / n);
		br.close();
	}
}
