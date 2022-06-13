package javadoko;

interface A {
	int test(int x, int y);
}

class B implements A {
	public int test(int x, int y) {
		return (x * y) / 2;
	}
}

class C implements A {
	public int test(int x, int y) {
		return (int) (3.2 * (x * y));
	}
}

public class M9_29 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		A[] array = { new B(), new C() };
		System.out.println(array[0].test(3, 2) + " ");
		System.out.println(array[1].test(3, 2) + " ");

	}

}
