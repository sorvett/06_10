package javadoko;

class Sword {
	String name; // 剣の名前
	int damage; // 剣の攻撃力
}

class Hero {
	String name;
	int hp;
	Sword sword;

	void attack(Matango m) {
		System.out.print(this.name + "は攻撃した！");
		m.hp -= 5;

	}
}

class Matango {
	int hp = 50;
	final int LEVEL = 10;
	char suffix;

	void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した");
	}

	void printInfo() {
		System.out.println(this.hp);
	}
}

public class Main9_03 {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println(h.name + "の現在の武器は、" + h.sword.name);
		

		Matango m = new Matango();
		m.printInfo();

	}

}
