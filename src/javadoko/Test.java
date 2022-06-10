package javadoko;

class ClassA{
	static String str;
	int num;
	
	public void print() {
		System.out.println("Super :" + str);
	}
}

public class Test  {
	public static void main(String[] args) {
		ClassA c1 = new ClassA();
		ClassA c2 = new ClassA();
		
		ClassA.str = "hoge";
		c1.num = 7;
		c2.num = 4;
		
		c1.print();
		c2.print();
	}

}
