package animal;
//변수가 animail 보다 더 많음 왜냐하면 상속받아서(확장) 
public class Dog extends Animal {
	public String type;
	public Dog() {
		System.out.println("도그생성자");
	}
	public void printInfor(String name, int age, String type) {
		System.out.println(name+age+type);
		
	}
	
}
