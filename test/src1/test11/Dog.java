package test11;

public class Dog {
	private String name;
	private int age;
	
	
	
	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;

	}
	

	public void printInfo() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
}
