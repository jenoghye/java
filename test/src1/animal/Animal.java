package animal;
//형변환으로 자식의 것을 알아낼 수 있음
public class Animal {
	public String name;
	public int age;
	public Animal() {
		System.out.println("동물생성자");
	}
	public void printInfor() {
		System.out.println(name);
		System.out.println(age);
		//System.out.println(type);
		
	}
	
	
}
