package test07;

public class Student {
	private String clazz;
	private String name;
	private int grade;
	// 모든 변수는 반드시 1개의 함수만 사용해서 한번에 1개의 값만 입력받을 수 있음
	// 해당 클래스의 class, name, grade를 출력하는 함수는 1개로 하셔도 됩니다.

	public void clazz(String clazz) {
		this.clazz = clazz;
	}

	public void name(String name) {
		this.name = name;
	}

	public void grade(int grade) {
		this.grade = grade;
	}
	
	public void getInfo() {
		System.out.println("1.class: "+clazz+"  2.name: "+name+"  3.grade: "+grade);
	}

}
