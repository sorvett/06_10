package lesson16;

import java.util.ArrayList;

public class Main16_01 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("たなか");
		names.add("すずき");
		names.add("さとう");
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for (String s : names) {
			System.out.println(s);
		}

	}

}
