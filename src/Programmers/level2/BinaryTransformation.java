package Programmers.level2;

public class BinaryTransformation {
	static int count = 0;
	static String trans(String s) {
		String trans = s.replaceAll("0", "");
		count += s.length() - trans.length();
		
		return Integer.toBinaryString(trans.length());
	}
	static int[] solution(String s) {
        int[] answer = new int[2];
        int transCount = 0;
        
        if (s.equals("1")) {
        	answer[0] = 0;
        	answer[1] = 0;
        	return answer;
        }
        
        while (true) {
        	transCount++;
        	s = trans(s);
        	if (s.equals("1")) {
        		answer[0] = transCount;
        		answer[1] = count;
        		break;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String s = "110010101001";
		int[] res = solution(s);
		
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
}
