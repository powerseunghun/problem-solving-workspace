package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckFileNameExtension1755 {
	static Map<String, String> init() {
		Map<String, String> extension = new HashMap<>();
		extension.put("dib", "Paint.Picture");
		extension.put("doc", "Word.Document.8");
		extension.put("docx", "Word.Document.12");
		extension.put("htm", "htmfile");
		extension.put("html", "htmlfile");
		extension.put("hwp", "Hwp.Document.96");
		extension.put("hwpx", "Hwp.Document.hwpx.96");
		extension.put("hwt", "Hwp.Document.hwt.96");
		extension.put("jpe", "jpegfile");
		extension.put("jpeg", "jpegfile");
		extension.put("jpg", "jpegfile");
		extension.put("ppt", "PowerPoint.Show.8");
		extension.put("pptx", "PowerPoint.Show.12");
		extension.put("pptxml", "powerpointxmlfile");
		return extension;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> extension = init();
		String tmp = br.readLine();
		
		System.out.println(extension.get(tmp.split("\\.")[1]));
		
	}
}
