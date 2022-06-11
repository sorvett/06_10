package javadoko;
class Super1 {
	static String name;
	public void print() {
		System.out.println("Super :" + name);
	}
}

class Sub1 extends Super1 {
	public void print() {
		System.out.println("Sub :" + name);
	}
}

public class Main9_06 {
	public static void main(String[] args) {
	Super1 a,b;
	a = new Super1();
	b = new Sub1();
	
	a.print();
	b.print();

	}
}
