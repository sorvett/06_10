package lesson16;

import java.util.HashMap;

public class Main16_06 {

	public static void main(String[] args) {
		HashMap<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		System.out.println("京都府の人口は、" + prefs.get("京都府"));
		System.out.println("熊本県の人口は、" + prefs.get("熊本県"));

		// 東京の人口を取得
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、" + tokyo);

		prefs.remove("京都府"); // 削除

		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);

	}

}
