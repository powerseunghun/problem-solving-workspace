package Acmicpc.As.B5.ThirtyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUAPC32154 {
	static String[] arr = {
			"A B C D E F G H J L M", 
			"A C E F G H I L M", 
			"A C E F G H I L M", 
			"A B C E F G H L M", 
			"A C E F G H L M", 
			"A C E F G H L M", 
			"A C E F G H L M", 
			"A C E F G H L M", 
			"A C E F G H L M", 
			"A B C F G H L M"
	};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(arr[N-1].replaceAll(" ", "").length());
		System.out.println(arr[N-1]);
		br.close();
	}
}
