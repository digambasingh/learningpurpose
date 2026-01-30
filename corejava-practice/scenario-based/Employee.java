
interface Employer{
	public void empName(String name);
}

public class Employee{
	public void printName(String name){
		System.out.println(name);
	}
	public static void main(String[] args){
		Employee e1 = new Employee();
		Employer e = e1 :: printName;
		e.empName("Digambar singh");
	}
}