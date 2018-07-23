package test29;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		System.out.println(1);
		List<Number> al = new ArrayList<Number>();
		
	Number n = al.get(0);
	al.set(0, 20);
	n = al.get(0);
	System.out.println(n);
	}
}
