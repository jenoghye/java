package test07;

public class Car {

	private int speed;
	private String name;
	private String company;
	
	public void carInfo(int speed, String name, String company) {
		this.speed = speed;
		this.name = name;
		this.company = company;
	}
	
	public void printInfo() {
		System.out.println("car Name : "+name +" car speed : " +speed+" car company :"+company);
	}
	
	
	
}
