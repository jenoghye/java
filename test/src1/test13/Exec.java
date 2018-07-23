package test13;

public class Exec {
	public static void main(String[]args) {
		Son s = new Son("dkemf");
		System.out.println(s);
		
		
		
		
		
		//super();는 아빠의 기본생성자이고, 원래는 기본적으로 읽게되어있지만
		//아빠가 super(매개변수)있으면 기본생성자 사용이 이나리서, 아들도 반드시 super안에 매개변수를 넣어야만 기본생성자호출가능
		
		//아들을 호출하면 아들 생성자로 호출 되지만 읽지 않고 바로 아빠생성자로가서
		//아빠의 생성자 안에 있는 것을 읽는다. 
		//아들의  클래스로 간다. 아들의 클래스의 this.name은 super.name으로 아버지의 name
		
		//this는 기본값셋팅시 사용, 에를들어 아들클래스에서 private int age;
		//선언하면 아들기본생성자 안에서 suepr("test); this(10);
		
		
		//아들기본생성자 반스디 private로 오버라이딩매서드
		
		
		Father f = s.getThis();
		System.out.println(f);
	}
	

}
