package Acmicpc.As.B2.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Comparator13420 {
    static boolean func(long a, char cmd, long b, long c) {
        long res = 0;
        switch(cmd) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
        }
        return res == c;
    }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
        int T = Integer.parseInt(br.readLine());
        long a = 0, b = 0, c = 0;
        char cmd = ' ';
        
        while(T-- > 0) {
            str = br.readLine();
            a = Long.parseLong(str.split(" ")[0]);
            cmd = str.split(" ")[1].charAt(0);
            b = Long.parseLong(str.split(" ")[2]);
            c = Long.parseLong(str.split(" ")[4]);   
            
            sb.append(func(a, cmd, b, c) ? "correct" : "wrong answer").append("\n");
        }
		
		System.out.print(sb.toString());
		br.close();
	}
}
