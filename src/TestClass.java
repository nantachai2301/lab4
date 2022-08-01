
public class TestClass {
	public static void main(String[] args) {
		Person p1 = new  Person();
		p1.setRole("Manager");
		p1.setSalary(20000);
		p1.setId(1);
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.setPerson("Programmer", 25000, 2);
		System.out.println(p2);
		Job j1  =new Job();
		j1.setRole("Tester");
		j1.setSalary(30000);
		j1.setId(3);
		Person p3 = new Person();
		p3.setPerson(j1);
		System.out.prinln(p3);
	}
}
