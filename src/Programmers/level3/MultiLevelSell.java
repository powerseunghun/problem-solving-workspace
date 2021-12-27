package Programmers.level3;

import java.util.HashMap;
import java.util.Map;

public class MultiLevelSell {
	static Map<String, String> level = new HashMap<>();
	static Map<String, Integer> money = new HashMap<>();
	static void mapInit(String[] enroll, String[] referral) {
		for (int i = 0; i < enroll.length; i++) {
			if (!money.containsKey(enroll[i])) {
				money.put(enroll[i], 0);
			}
		}
		money.put("center", 0);
		
		for (int i = 0; i < enroll.length; i++) {
			if (referral[i].equals("-")) {
				level.put(enroll[i], "center");
				continue;
			}
			if (!level.containsKey(enroll[i])) {
				level.put(enroll[i], referral[i]);
			}
		}
	}
	static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        String sell = null;
        mapInit(enroll, referral);
        
        double val = 0;
        int transMoney = 0;
        for (int i = 0; i < seller.length; i++) {
        	sell = seller[i];
        	val = amount[i] * 100;
        	while (level.containsKey(sell) && !level.get(sell).equals("center") && val > 0) {
        		transMoney = (int)(val / 10);
        		money.put(sell, money.get(sell)+(int)(val-transMoney));
        		val = transMoney;
        		sell = level.get(sell);
        	}
        	transMoney = (int)(val / 10);
        	money.put(sell, money.get(sell)+(int)(val-transMoney));
        	
        	val = transMoney;
        	money.put("center", money.get("center")+(int)val);
        }
        for (int i = 0; i < enroll.length; i++) {
        	answer[i] = money.get(enroll[i]);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
//		String[] seller = {"young", "john", "tod", "emily", "mary"};
		String[] seller = {"sam", "emily", "jaimie", "edward"};
		int[] amount = {2, 3, 5, 4};
		int[] res = solution(enroll, referral, seller, amount);
		
		for (int el : res) {
			System.out.println(el);
		}
	}
}
