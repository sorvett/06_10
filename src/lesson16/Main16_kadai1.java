package lesson16;

import java.util.HashMap;

public class Main16_kadai1 {
	public static void main(String[] args) {
		 HashMap<String, Integer> skills = new HashMap<String, Integer>();
	        skills.put("攻撃力", 150);
	        skills.put("防御力", 100); 
	        skills.put("魔法力", 200);
	        skills.put("移動力", 380);
	        System.out.println(skills.get("攻撃力"));
	        System.out.println(skills.get("防御力"));
	        System.out.println(skills.get("魔法力"));
	        System.out.println(skills.get("移動力"));
	        
	}

}
