package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P49GroupAnagrams {
    static List<List<String>> res = new ArrayList<>();
    static Map<String, List<String>> map = new HashMap<>();
    static String compString(String str) {
        int[] compCheck = new int[27];
        for (int i = 0; i < str.length(); i++) {
            compCheck[str.charAt(i)-'a']++;
        }
        String res = "";
        for (int i = 0; i < compCheck.length; i++) {
            if(compCheck[i] != 0) {
                for (int j = 0; j < compCheck[i]; j++) {
                    res += (char)(i+97);
                }
            }
        }
        return res;
    }
    static void inputList(String cStr, String str) {
        List<String> tList = map.containsKey(cStr) ? map.get(cStr) : new ArrayList<>();
        tList.add(str);
        map.put(cStr, tList);
    }
    static void mapToList() {
        Iterator iter = map.keySet().iterator();
        int count = 0;
        while (iter.hasNext()) {
            count++;
            res.add(map.get(iter.next()));
        }
    }
    static List<List<String>> groupAnagrams(String[] strs) {
        res.clear();
        map.clear();
        
        for (int i = 0; i < strs.length; i++) {
            inputList(compString(strs[i]), strs[i]);
        }
        mapToList();
        Collections.sort(res, new Comparator<List>() {
			@Override
			public int compare(List o1, List o2) {
				return o1.size()-o2.size();
			}
		});
        for (int i = 0; i < res.size(); i++) {
            Collections.sort(res.get(i));
        }
        return res;
    }
	public static void main(String[] args) {
		
	}
}
