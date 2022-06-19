package lesson15;

public class Main15_09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name1 = "minato";
		String name2 = "asaka";
		String name3 = "sugawara";
		
		String ch1 = "hero";
		String ch2 = "witch";
		String ch3 = "sage";
		
		int money1 = 280;
		int money2 = 3200;
		int money3 = 4100;
		
		System.out.println("■キャラクターの状態■");
		final String FORMAT = "%-10s %-9s 所持金%, 6d";
		String s1 = String.format(FORMAT, name1, ch1, money1);
		System.out.println(s1);
		
		String s2 = String.format(FORMAT, name2, ch2, money2);
		System.out.println(s2);
		
		String s3 = String.format(FORMAT, name3, ch3, money3);
		System.out.println(s3);
		

	}

}
