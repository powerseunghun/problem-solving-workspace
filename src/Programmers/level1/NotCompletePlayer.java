package Programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NotCompletePlayer {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
		Arrays.sort(completion);
        
		for (int i = 0; i < completion.length ; i++) {
			if (participant[i] != completion[i]) {
				answer += participant[i];
				break;
			}
		}
        if (answer.equals("")) answer += participant[participant.length - 1];
        return answer;
    }
	
	public String solution2(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> list = new HashMap<>();
		int count = completion.length;
		for (int i = 0; i < completion.length; i++) {
			list.put(completion[i], i);
		}
		for (int i = 0; i < participant.length; i++) {
			if (!list.containsKey(participant[i])) {
				answer += participant[i];
				break;
			}
			else list.remove(participant[i]);
		}
		if (answer.equals("")) answer += participant[participant.length - 1];
		return answer;
	}
	public String solution3(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> list = new HashMap<>();
		
		for (int i = 0; i < completion.length; i++) {
			if (!list.containsKey(completion[i])) {
				list.put(completion[i], 1);
			}
			else {
				list.put(completion[i], list.get(completion[i]) + 1);
			}
		}
		for (int i = 0; i < participant.length; i++) {
			if (!list.containsKey(participant[i])) {
				answer += participant[i];
				break;
			}
			else {
				list.put(participant[i], list.get(participant[i]) - 1);
				if (list.get(participant[i]) < 0) {
					answer += participant[i];
					break;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(new NotCompletePlayer().solution3(participant, completion));
	}
}
