@FunctionalInterface
interface Square{
	public int square(int n);
}

public class Student{
	public static void main(String[] args){
		Square s = n -> n*n;
		
		System.out.println(s.square(5));
	}
}