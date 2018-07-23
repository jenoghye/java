package test24;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.size());
		hs.add("a");
		hs.add("a");
		hs.add("a");
		hs.add("a");
		hs.add("a");
		System.out.println(hs.size());//중복안돼용!! 같은 거 넣어도 한개!!!!!!!!
	}
}
