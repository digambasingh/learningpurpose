@FunctionalInterface
interface Sleeper{
	public void sleep();
}

class Demo implements Sleeper{
   @Override
   public void sleep(){
		System.out.println("Sleep method");
   }
}


public class Main{
	public static void main(String[] args){
		Sleeper s = new Demo();
		s.sleep();
	}
}