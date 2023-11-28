import java.security.SignatureSpi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
public static void main(String[] args) {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(1);
	list1.add(5);
	list1.add(10);
	list1.add(8);
	list1.add(12);
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	for(int i : list1) {
		if(i%2==0)
			list2.add(i);
	}
	System.out.println("general approach");
	System.out.println(list2);
	
	System.out.println();
// we use filter to have some objects only
	System.out.println("using stream");
	List<Integer> list3 = list1.stream().filter(i -> i%2==0).collect(Collectors.toList());
	list3.forEach(System.out::println);
	
System.out.println();
// we use map when there has to be new object created for every object. Ex: for i=1, i*2(1*2=2) new object of 2 created``
System.out.println("each element doubled");
	List<Integer> list4 = list1.stream().map(i->i*2).collect(Collectors.toList());
	System.out.println(list4);
	
System.out.println("sorting in ascending");
	List<Integer> list5 = list1.stream().sorted().collect(Collectors.toList());
	System.out.println(list5);

System.out.println("sorting in descending");
	List<Integer> list6 = list1.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	System.out.println(list6);
	
	long size = list6.stream().filter(i->i>5).count();
	System.out.println("\n size is"+size);
}
}
