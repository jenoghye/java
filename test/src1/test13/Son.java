package test13;

public class Son extends Father {
	public Son(String name) {
		this.name = name;
	}

	//아빠한테도getThis가 있는데 매서드 데이터 타입이 같아야하는데 이름이 다른데도 가능함
	//Son이 Father로 불리울수 있음!! 상속받아서
	public Son getThis() {//데이터타입이 Son
		return this;
	}

}
