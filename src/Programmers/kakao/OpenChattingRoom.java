package Programmers.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class OpenChattingRoom {
	static List<String> history = new ArrayList<>();
	static Map<String, String> map = new HashMap<>();
	static String[] solution(String[] record) {
        String[] answer = null;
        
        StringTokenizer st = null;
        String cmd = null, userId = null, nickName = null;
        for (int i = 0; i < record.length; i++) {
        	st = new StringTokenizer(record[i]);
        	cmd = st.nextToken();
        	userId = st.nextToken();
        	nickName = !cmd.equals("Leave") ? st.nextToken() : "";
        	
        	switch(cmd) {
        	case "Enter":
        		map.put(userId, nickName);
        		history.add(userId + "님이 들어왔습니다.");
        		break;
        	case "Leave":
        		history.add(userId + "님이 나갔습니다.");
        		break;
        	case "Change":
        		map.put(userId, nickName);
        		break;
        	}
        }
        answer = new String[history.size()];
        for (int i = 0; i < history.size(); i++) {
        	String id = history.get(i).substring(0, history.get(i).indexOf("님"));
        	answer[i] = history.get(i).replace(id, map.get(id));
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		solution(record);
//		for (int i = 0; i < record.length; i++) {
//			System.out.println(record[i]);
//		}
	}
}
