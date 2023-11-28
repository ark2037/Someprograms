import java.util.function.Predicate;
//FUNCTION INTERFace - predictate
/*class PredicateDemo implements Predicate<Integer>{
	@Override
	public boolean test(Integer i) {
		if(i>10)
			return true;
		else 
			return false;
	}
*/
public class PredicateDemo {
public static void main(String[] args) {
	//Predicate<Integer> p1 = new PredicateDemo();
Predicate<Integer> p1 = i -> i>10;
System.out.println(p1.test(10));

int[] arr = {10,5,4,9,7,11,18,16,8,2,12};
Predicate<Integer>p2 = j -> j>10;
Predicate<Integer>p3 = k -> k%2==0;
System.out.println("\nElements more than 10:");
pmethod(p2,arr);
System.out.println("\nEven Elements :");
pmethod(p3,arr);
System.out.println("\nElement more than 10 and even");
pmethod(p2.and(p3),arr);
System.out.println("\nElement more than 10 or even");
pmethod(p2.or(p3), arr);
System.out.println("\nelements which are not even");
pmethod(p3.negate(), arr);
}
public static void pmethod(Predicate<Integer>p,int[] arr) {
	for(int i:arr) {
		if(p.test(i)) 
			System.out.print(i+" ");
	}
}
//public static void evenele(Predicate<Integer>p3,int[] arr) {
//	for(int i:arr) {
//		if(p3.test(i))
//			System.out.println(i);
//	}
//}

}
