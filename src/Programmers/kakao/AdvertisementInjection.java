package Programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;

public class AdvertisementInjection {
	// 60 * 60 * 100
	static int[] arr = new int[360000];
	static int strToInt(String str) {
		int h = Integer.parseInt(str.split(":")[0]);
		int m = Integer.parseInt(str.split(":")[1]);
		int s = Integer.parseInt(str.split(":")[2]);
		
		return h*3600 + m*60 + s;
	}
	static String intToStr(int n) {
		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < 3; i++) {
//			sb.append(String.format("%02d", n%60));
//			if (i < 2) {
//				sb.append(":");
//				n /= 60;
//			}
//		}
		int s = n % 60;
		n /= 60;
		int m = n % 60;
		n /= 60;
		int h = n;
		sb.append(String.format("%02d:", h));
		sb.append(String.format("%02d:", m));
		sb.append(String.format("%02d", s));
		return sb.toString();
	}
	static int getMaxSeqSumIdx(String play_time, String adv_time) {
		int totalTime = strToInt(play_time), advTime = strToInt(adv_time), start = 0;
		long sum = 0, maxSeqSum = Long.MIN_VALUE;
		
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < advTime; i++) {
			sum += arr[i];
			q.add(arr[i]);
		}
		maxSeqSum = sum;
		
		for (int i = advTime; i < totalTime; i++) {
			sum += arr[i];
			q.add(arr[i]);
			sum -= q.poll();
			if (sum > maxSeqSum) {
				start = i-advTime+1;
				maxSeqSum = sum;
			}
		}
		return start;
	}
	static String solution(String play_time, String adv_time, String[] logs) {
		int start = 0;
		String answer = null, str1 = null, str2 = null;
		for (int i = 0; i < logs.length; i++) {
			str1 = logs[i].split("-")[0];
			str2 = logs[i].split("-")[1];
			
			for (int j = strToInt(str1); j < strToInt(str2); j++) {
				arr[j]++;
			}
		}
		start = getMaxSeqSumIdx(play_time, adv_time);
		return intToStr(start);
	}
	public static void main(String[] args) {
		String play_time = "02:03:55";
		String adv_time = "00:14:15";
		String[] logs = {"01:20:15-01:45:14", 
				"00:40:31-01:00:00", 
				"00:25:50-00:48:29", 
				"01:30:59-01:53:29", 
				"01:37:44-02:02:30"};
		solution(play_time, adv_time, logs);
		
		System.out.println("END");
	}
}
