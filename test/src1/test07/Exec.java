package test07;

public class Exec {
	public static void main(String[] args) {
		Car c = new Car();
		c.carInfo(20, "qnd", "bmw");
		c.printInfo();

		
		int length = 10;
		Car[] c1 = new Car[length];

		for (int i = 0; i < c1.length; i++) {
			c1[i] = new Car();

		}

		c1[0].carInfo(20, "qnd", "bmw");
		c1[1].carInfo(20, "qnd", "bmw");
		c1[2].carInfo(20, "qnd", "bmw");
		c1[3].carInfo(20, "qnd", "bmw");

		for (int i = 0; i < c1.length; i++) {
			c1[i].printInfo();

		}
	}

}
