package test14;
//기본생성자 안에 아빠의 기본생성자 호출
public class Son extends Father {
//아빠super();생성자가 불가능
//값을 받든 안받든 자신의 생성자 호출 후 아빠 생성자 안에 같은 매개변수를 넣어줌
	Son(){
		super("abc");
	}

}
