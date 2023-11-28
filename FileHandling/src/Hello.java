import java.util.*;
import java.util.function.*;
 class Demo implements Consumer<String> {
	@Override
	public void accept(String name) {
		System.out.println(name);
	}
}
public class Hello{
	public static void main(String[] args) {
		ArrayList<String>a = new ArrayList<String>();
		a.add("ram");
		a.add("krish");
		a.add("radha");
		
		a.forEach(System.out::println);
		Consumer<String> con = new Demo();
		a.forEach(con);
		System.out.println();
		a.forEach(i -> System.out.println(i));
	}
}