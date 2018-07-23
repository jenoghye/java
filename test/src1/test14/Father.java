package test14;
//기본생성자 자동으로
public class Father {

	
	public String name;
	
	public Father(String name) {//new생성자 불가능 하려면 기본생성자매소드가 있어야함
		this.name = name;
	}
	public String toString(String name) {
	return "내이름은"+name;	
	}
}
