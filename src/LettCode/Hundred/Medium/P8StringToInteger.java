package LettCode.Hundred.Medium;

public class P8StringToInteger {
    static int myAtoi(String s) {
    	int lSpace = 0;
    	boolean isNegative = false;
    	String str = "";
    	long tres = 0;
        if (s.equals("")) return 0;
    	if (s.length() >= 1 && s.charAt(0) == ' ') {
    		for (int i = 1; i < s.length(); i++) {
    			if (s.charAt(i) != ' ') {
    				lSpace = i;
    				break;
    			}
    		}
    		s = s.substring(lSpace, s.length());
    	}
    	if (s.length() >= 1 && s.charAt(0) == '-') {
    		isNegative = true;
    		s = s.substring(1, s.length());
    	}
        else if (s.length() >= 1 && s.charAt(0) == '+') {
    		isNegative = false;
    		s = s.substring(1, s.length());
    	}
    	if (s.length() >= 1 && (!(s.charAt(0) >= '0' && s.charAt(0) <= '9'))) {
    		return 0;
    	}
    	
    	boolean appearNumber = false;
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
    			if (!appearNumber && s.charAt(i) == '0') continue;
    			appearNumber = true;
    			str += s.charAt(i);
    		}
            else break;
    	}
        if (str.equals("")) return 0;
        else if (str.length() >= 19) return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE; 
    	tres = Long.parseLong(str);
    	
    	if (tres >= Integer.MIN_VALUE && tres <= Integer.MAX_VALUE) {
    		return isNegative ? Integer.parseInt(str) * -1 : Integer.parseInt(str);
    	}
    	else return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }
	public static void main(String[] args) {
		
	}
}
