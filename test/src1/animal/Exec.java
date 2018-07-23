package animal;

//Interface
public class Exec {
	public static void main(String[]args) {
		
		Animal c = new Dog(); //c= new Cat();
		c.printInfor();
		//animal이아니고 dog 것으로 나옴
		//c=new Cat();
		
		
		//아빠생성자 먼저 실행후 아들생성자 실행!
		//((Dog)c).type=new Do
				Dog d =(Dog)c;//형변환!!!!! 왜냐하면 자식이 기능적으로 더 많이 가지고 있으므로 더 크다
				              //마치 인트가 롱으로 형변환가능한것처럼
				d.name="zk";//내용을 바꿔서 나온당!!!!!
				
		
		c.printInfor();//cat에는 없으므로 Animal의 것이 나옴
		
		
	}
}
