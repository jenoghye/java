package test29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * animal이라는 클래스 생성
 * name이라는 String변수 생성
 * Dog cat이라는 클래스 생성  animal이라는 클래스 상속
 * animal만 가질 수 있는  aniList생성
 * 2마리의 개와 2마리의 고양이를 aniList에  저장하고 출력하는 코드를 작성해주세요*/

public class ListTest03 {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();// Person[] ps = new Person[0];
		// person만 가질 수 있는 리스트

		/*Person p = new Person("홍길동", 22);
		pList.add(p);
		pList.add(new Person("홍길동", 22));*/

		// 반복문으로 나이만 랜덤으로 1-100집어 넣어서 총 10사람 리스트 출력

		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("이름을 입력하시오");
	        String name = scan.nextLine();
			
	        System.out.println("나이입력");
	        String age1 = scan.nextLine();
	        
	        int age = Integer.parseInt(age1);
			//int age = (int) (Math.random() * 100) + 1;

			pList.add(new Person(name, age));

		}
		for (Person p : pList) {
			System.out.println(p);
		}

		
	}
}
