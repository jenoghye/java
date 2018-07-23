package practice;

public class ToStringInObject {

	public String toString() {
		return "";
	}
	
	public static void print (String someText) {
		String str = someText.toString();
		System.out.println(str);
	}
	
	public static void print(Object someObject) {
		String str = someObject.toString();
		System.out.println(str);
	}
	
	public static void main(String[]args) {
		
		String str = "ASdf";
		print(str);
	}
	
}
