package lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main16_07_01 {
	public static void main(String[] args) {
		// 東京
		List<String> tokyo = new ArrayList<String>();
		tokyo.add("切子");
		tokyo.add("佃煮");
		tokyo.add("寿司");
		tokyo.add("のり");
		
		//京都
		List<String> kyoto = new ArrayList<String>();
		kyoto.add("織物");
		kyoto.add("人形");
		kyoto.add("漬物");
		kyoto.add("陶器");
		
		Map<String, List<String>> prefs = new HashMap<String, List<String>>();
		prefs.put("東京", tokyo);
		prefs.put("京都", kyoto);
		
		for(String key : prefs.keySet()) {
			System.out.print(key + ":");
			
			List<String> list = prefs.get(key);
			for (String s : list) {
				System.out.print(s + ":");
			}
			System.out.println();
		}
		

	}

}
