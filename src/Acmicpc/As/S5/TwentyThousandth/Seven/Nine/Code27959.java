package Acmicpc.As.S5.TwentyThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code27959 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	int N = Integer.parseInt(str.split(" ")[0]);
    	int M = Integer.parseInt(str.split(" ")[1]);
    	
    	if (N*100 >= M) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
    	}
    	br.close();
	}
}
