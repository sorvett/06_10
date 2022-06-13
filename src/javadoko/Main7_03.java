package javadoko;
class SuperClass1 {
	private int num;
	public void setNum(int num) {
		this.num = num;
	}
}

class SubClass4 extends SuperClass1 {
	private int num;
	public int getNum() {
		return this.num;
	}
}

public class Main7_03 {
	public static void main(String[] args) {
		SubClass4 sub = new SubClass4();
		sub.setNum(10);
		System.out.println(sub.getNum());

	}

}
