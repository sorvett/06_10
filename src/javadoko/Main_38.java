package javadoko;

class Employee {
	public void disp() {
		System.out.println("Employee");
	}
}

class Manager extends Employee {
	@Override
	public void disp() {
		super.disp();
		System.out.println("Manager");
	}
}

public class Main_38 {
	
	public static void main(String[] args) {
		Manager m = new Manager();
		m.disp();
		Employee e = m;
		e.disp();

	}

}
