package test30;

import java.util.ArrayList;

public class Animal {
	String name;
	private ArrayList<Animal> aniList;
	




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Animal> getAniList() {
		return aniList;
	}

	public void setAniList(ArrayList<Animal> aniList) {
		this.aniList = aniList;
		
	}
	@Override
	public String toString() {
		return "Animal [name=" + name +"]";
	}
	
	public static void main(String[] args) {
		ArrayList<Animal> aniList = new ArrayList<Animal>(4);
		
		Animal dog = new Dog();
		dog.setName("몽구");
		aniList.add(dog); 
		
		dog = new Dog();
		dog.setName("봉구");
		aniList.add(dog); 
		
		Animal cat = new Cat();
		cat.setName("냥냥이");
		aniList.add(cat);
		
		cat = new Cat();
		cat.setName("냐옹이");
		aniList.add(cat);
	
		
		
	 for(Animal d : aniList) {
		 System.out.println(d);
	 }

	 for(Animal c : aniList) {
		 System.out.println(c);
	 }
	 
		
		
				 
	}

	
}
