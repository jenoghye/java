package test11;

public class Exec {

	public static void main(String[]args) {
		
		Test t = new Test();
		t.setNum(20);
		t.printNum();
		
		
		
		
		Dog d = new Dog();
		d.setInfo("aaa",10);
		d.printInfo();
		
		
		
//////////////////////////////////////////////////////
		
		
		
		Dog[] d1 = new Dog[6];
		for(int i = 0; i<d1.length;i++) {
		d1[i]=new Dog();//메모리생성!
		
			}
		
		d1[0].setInfo("dd", 33);
		d1[1].setInfo("dd", 33);
		d1[2].setInfo("dd", 33);
		d1[3].setInfo("dd", 33);
		d1[4].setInfo("dd", 33);
		d1[5].setInfo("dd", 33);
		
		
		for(int i = 0; i<d1.length;i++) {
		d1[i].printInfo();
		
			}
		
		
		
	
		
		
				
	
	}
}
