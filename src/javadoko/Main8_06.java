package javadoko;
class Cleric {
	String name;
	int hp = 50;
	final int maxHP = 50;
	int mp = 10;
	final int maxMP = 10;
	
	void selAid() {
		
		this.hp = maxHP;
		
		this.mp -= 5; 	//mp -= 5;にしていた
	}
	
	int pray(int sec) {			//解けなかった
		System.out.println(this.name + "は" + sec + "秒間天に祈った!");
		
		//論理上の回復量を乱数を用いて決定する
		int recover = (int)(Math.random()*3);
		//実際の回復量を計算する
		int recoverActual = Math.min(this.maxHP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.print("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
public class Main8_06 {
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "ccB";
		c.pray(4);

	}

}
