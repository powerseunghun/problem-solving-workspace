package Programmers.kakao;

import java.util.HashMap;
import java.util.Map;

public class MatchingScore {
	static String[] pageNames = null;
	static int[] basicScore = null;
	static int[] externalLink = null;
	static Map<String, Integer> idxMap = new HashMap<>();
	static double[] total = null;
	static double max = Integer.MIN_VALUE;
	
	static void init(String[] pages) {
		pageNames = new String[pages.length];
		basicScore = new int[pages.length];
		externalLink = new int[pages.length];
		total = new double[pages.length];
	}
	static void extractPageName(String[] pages) {
		int linkIdx = 0;
		for (int i = 0, idx1 = 0, idx2 = 0, count = 0; i < pages.length; i++, count = 0) {
			String urlPattern = "<meta property=\"og:url\" content=\"";
			idx1 = pages[i].indexOf(urlPattern) + urlPattern.length();
			idx2 = pages[i].indexOf("\"", idx1);
			pageNames[i] = pages[i].substring(idx1, idx2);
			idxMap.put(pageNames[i], i);
			
			idx1 = pages[i].indexOf("<a href", 0);
			while (idx1 != -1) {
				idx2 = pages[i].indexOf("</a>", idx1);
				count++;
				idx1 = pages[i].indexOf("<a href", idx2);
			}
			externalLink[i] = count;
		}
		
		double tmpVal = 0;
		for (int i = 0, idx1 = 0, idx2 = 0; i < pages.length; i++) {
			tmpVal = 0;
			idx1 = pages[i].indexOf("<a href", 0);
			total[i] += basicScore[i];
			while (idx1 != -1) {
				idx2 = pages[i].indexOf("</a>", idx1);
				String tmp = pages[i].substring(idx1, idx2).split("\"")[1];
				if (!idxMap.containsKey(tmp)) {
					idx1 = pages[i].indexOf("<a href", idx2);
					continue;
				}
				linkIdx = idxMap.get(tmp);
				tmpVal = (double)basicScore[i] / externalLink[i];
				total[linkIdx] += tmpVal;
				idx1 = pages[i].indexOf("<a href", idx2);
			}
			if (idx1 == -1) continue;
		}
		for (int i = 0; i < total.length; i++) {
			max = Math.max(total[i], max);
		}
	}
	static void searchWord(String word, String[] pages) {
		String tmp = null;
		for (int i = 0, idx1 = 0, count = 0, idx2 = 0; i < pages.length; i++, count = 0) {
			idx1 = pages[i].indexOf("<body>");
			idx2 = pages[i].indexOf("</body>", idx1+1);
			tmp = pages[i].substring(idx1+6, idx2);
			for (String s : tmp.split("[^a-zA-Z]")) {
				if (s.toUpperCase().equals(word.toUpperCase())) {
					count++;
				}
			}
			basicScore[i] = count;
		}
	}
	static int solution(String word, String[] pages) {
        int answer = 0;
        init(pages);
		searchWord(word, pages);
		extractPageName(pages);
		
		for (int i = 0; i < total.length; i++) {
			if (total[i] == max) {
				answer = i;
				break;
			}
		}
        
        return answer;
    }
	public static void main(String[] args) {
//		String word = "blind";
		String word = "Muzi";
//		String[] pages = {"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://a.com\"/>\n</head>  \n<body>\nBlind Lorem Blind ipsum dolor Blind test sit amet, consectetur adipiscing elit. \n<a href=\"https://b.com\"> Link to b </a>\n</body>\n</html>", "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://b.com\"/>\n</head>  \n<body>\nSuspendisse potenti. Vivamus venenatis tellus non turpis bibendum, \n<a href=\"https://a.com\"> Link to a </a>\nblind sed congue urna varius. Suspendisse feugiat nisl ligula, quis malesuada felis hendrerit ut.\n<a href=\"https://c.com\"> Link to c </a>\n</body>\n</html>", "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://c.com\"/>\n</head>  \n<body>\nUt condimentum urna at felis sodales rutrum. Sed dapibus cursus diam, non interdum nulla tempor nec. Phasellus rutrum enim at orci consectetu blind\n<a href=\"https://a.com\"> Link to a </a>\n</body>\n</html>"};
//		String[] pages = {"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://careers.kakao.com/interview/list\"/>\n</head>  \n<body>\n<a href=\"https://programmers.co.kr/learn/courses/4673\"></a>#!MuziMuzi!)jayg07con&&\n\n</body>\n</html>", "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://www.kakaocorp.com\"/>\n</head>  \n<body>\ncon%\tmuzI92apeach&2<a href=\"https://hashcode.co.kr/tos\"></a>\n\n\t^\n</body>\n</html>"};
		String[] pages = {"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://careers.kakao.com/interview/list\" hello=\"hello\"/>\n</head>  \n<body>\n<a href=\"https://programmers.co.kr/learn/courses/4673\"></a>#!MuziMuzi!)jayg07con&&\n\n</body>\n</html>", "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://www.kakaocorp.com\"/>\n</head>  \n<body>\ncon%\tmuzI92apeach&2<a href=\"https://hashcode.co.kr/tos\"></a>\n\n\t^\n</body>\n</html>"};
		
		System.out.println(solution(word, pages));
	}
}
