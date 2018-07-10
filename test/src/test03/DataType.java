package test03;

public class DataType {

	public static void main(String[] args) {
		boolean bl = true;
		System.out.println(bl);
		System.out.println(1 == 1);// datatype맞을시 bl에 대입
		System.out.println(3 == 4);
		bl = 1 == 1;
		System.out.println(bl);

		int a = 3;
		int v = 4;
		bl = a != v;
		if (a != v) {
			System.out.println("a와 v의 값이 다름");
		} else {
			System.out.println("a와v의값동일");
		}
		if (bl) {
			System.out.println("a와 v의 값이 다름");
		} else {
			System.out.println("a와v의값동일");
		}

		boolean bl1 = true;
		bl1 = 3 != 3;//bl1에 3!=3이 다른지 물은 것을 대입
		if(bl1) {
			System.out.println(bl1+"이 같음");
		}else {
			System.out.println(bl1+"이 다름");
		}

	}

}
// bl>>비교연산자!대입 //if문에서 데이터 타입이 bl일경우 true or false
