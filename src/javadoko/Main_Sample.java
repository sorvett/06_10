package javadoko;

 class Super {
	static String name;
	public void print() {
		System.out.println("Super :" + name);
	}
}

 class Sub extends Super{
	 public void print() {
		 System.out.println("Sub :" + name);
	 }
 }
 
public class Main_Sample {
	public static void main(String[] args) {
		Super a, b;
		a = new Super();
		b = new Sub();
		
		a.name = "A";
		b.name = "B";
		
		a.print();
		b.print();
		
	}
}
