package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoteControl3120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]), b = Integer.parseInt(tmp.split(" ")[1]);
		int val = Math.abs(b-a), count = 0;
		
		count += (val / 10);
		switch(val % 10) {
		case 1: case 5:
			count += 1;
			break;
		case 2: case 4: case 6: case 9:
			count += 2;
			break;
		case 3: case 7: case 8:
			count += 3;
			break;
		}
		
		System.out.println(count);
	}
}
