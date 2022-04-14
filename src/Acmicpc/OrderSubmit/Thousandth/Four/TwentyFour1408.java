package Acmicpc.OrderSubmit.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwentyFour1408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int curHour = 0, curMin = 0, curSec = 0;
		int goalHour = 0, goalMin = 0, goalSec = 0;
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			switch(i) {
			case 0:
				curHour = Integer.parseInt(tmp.split(":")[0]);
				curMin = Integer.parseInt(tmp.split(":")[1]);
				curSec = Integer.parseInt(tmp.split(":")[2]);
				break;
			case 1:
				goalHour = Integer.parseInt(tmp.split(":")[0]);
				goalMin = Integer.parseInt(tmp.split(":")[1]);
				goalSec = Integer.parseInt(tmp.split(":")[2]);
				break;
			}
		}
		if (curSec > goalSec) {
			goalSec += 60;
			goalMin -= 1;
		}
		goalSec -= curSec;
		
		if (curMin > goalMin) {
			goalMin += 60;
			goalHour -= 1;
		}
		goalMin -= curMin;
		goalHour -= curHour;
		
		System.out.print(goalHour < 0 ? String.format("%02d:", goalHour+24) : String.format("%02d:", goalHour));
		System.out.print(goalMin < 0 ? String.format("%02d:", (int)Math.abs(goalMin)) : String.format("%02d:", goalMin));
		System.out.println(goalSec < 0 ? String.format("%02d", (int)Math.abs(goalSec)) : String.format("%02d", goalSec));
		br.close();
	}
}