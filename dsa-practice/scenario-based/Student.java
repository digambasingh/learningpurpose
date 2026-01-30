import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class Student{
	public static void main(String[] args){
		List<Integer> marks = Arrays.asList(54,67,98,99,76,55,56);
		List<Integer> odd = marks.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println(odd);
	}
}