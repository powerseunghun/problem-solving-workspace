package Codeforce.OrderSubmit.OneThousandth.OneHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DominiPiling {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		boolean isEven = (M*N) % 2 == 0;
		
		System.out.println(isEven ? (M*N) / 2 : (int)(M*N/2));
		br.close();
	}
}
