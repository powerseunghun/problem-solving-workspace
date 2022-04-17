package Acmicpc.OrderSubmit.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitMove11943 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int[] arr = new int[4];
		for (int i = 0; i < 4; i+=2) {
			tmp = br.readLine();
			arr[i] = Integer.parseInt(tmp.split(" ")[0]);
			arr[i+1] = Integer.parseInt(tmp.split(" ")[1]);
		}
		
		System.out.println(Math.min(arr[0]+arr[3], arr[1]+arr[2]));
		br.close();
	}
}
