package lesson16;

import java.util.HashMap;

public class Main16_practice1 {

	public static void main(String[] args) {
		HashMap<String, String> enemyMap = new HashMap<String, String>();
		enemyMap.put("ザコ", "スライム");
		enemyMap.put("中ボス", "ドラゴン");
		System.out.println(enemyMap.get("ザコ"));
		System.out.println(enemyMap.get("中ボス"));
		
		enemyMap.put("ザコ", "モンスター");
		System.out.println(enemyMap.get("ザコ"));

	}

}
