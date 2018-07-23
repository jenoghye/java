package test27;

import java.util.ArrayList;

import test29.ListTest;

public class zz {

	private String[] strArr;
	public static void main(String[]args) {
		ArrayList<String> al = new ArrayList<String>();
		ListTest lt = new ListTest();
		System.out.println(lt.size());
		lt.add("1");
		lt.add("2");
		lt.add("3");
		lt.remove("1");

		System.out.println(lt.size());
		
	/*	System.out.println(lt.size());
		System.out.println(lt);
		for(int i = 0;i<lt.size();i++) {
			System.out.println(lt.get(i));
		}
		System.out.println(lt.indexOf("cc"));
		String str = "abcde";
		//str = str.substring(1);//bcde
		str = str.substring(1,2);//2가 c 이므로
		System.out.println(str);
		*/
	
	public zz() {
		this.strArr = new String[0];
	}
	public boolean add(String str) {
		String[] tmpArr = this.strArr;
		
		this.strArr = new String[this.strArr.length+1];
		for(int i = 0; i<tmpArr.length;i++) {
			this.strArr[i]= tmpArr[i];
		}
		this.strArr[this.strArr.length-1]=str;
		return true;
	}
	public boolean remove(int idx) {
		String[] tmpArr = this.strArr;
		this.strArr = new String[this.strArr.length-1];
		for(int i = 0; i<tmpArr.length;i++) {
			this.strArr[i] = tmpArr[i];
		}
		for(int i = idx;i<tmpArr.length;i++) {
			this.strArr[i-1] = tmpArr[i];
		}
		return true;
	}
	public int size() {
		return this.strArr.length;
	}
	public String toString() {
		String str = "[";
		for(String s:this.strArr) {
			str += s+",";
		}
		str = str.substring(0,str.length()-1);
		str +="]";
		return str;
	}
	
	public String get(int idx) {
		if(this.strArr.length<=idx) {
			System.out.println(idx+"빈방없음");
		}
		return this.strArr[idx];
	}
	public static void main(String[]args) {
		
		zz z = new zz();
		z.add("abc");
		System.out.println(z);
	}
	
}
