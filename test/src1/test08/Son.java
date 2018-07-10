package test08;

//접근제어자가 상속받은 아빠의 것보다 더 커야 가능 함! public<protected<default<private//아빠가 default 인데 아들이 private이면 안됨
//아빠가 void이면 아들도 void여야함! 같은 함수!!


public class Son extends Father {
	
	public void work() {
		System.out.println("암 ~그룻");
	}
	String work(String a) {//return개념 
		return "abc";
	}

	public void work(int a) {//이건 OverLoading이므로 다른 함수
		System.out.println("암 ~그룻");
	}
	
	
	
	public static void main(String[] args) {
		Son s = new Son();
		s.work(1);
		
		s.work("d");
		System.out.println(s.work("d"));//<<data type이 String이라 가능
	}
}
