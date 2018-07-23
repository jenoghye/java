package test15;

public class Practice {
	public String[] arrStr;
	private int idx = 0;
	
	Practice(int length){
		arrStr = new String[length];
	}
	
	
	public boolean add(String str) {
		if(idx==arrStr.length) {
			System.out.println("초과");
			return false;
		}
		this.arrStr[idx] = str;
		idx++;
		return true;
	}
	
	public int indexOf(String str) {
		for(int i = 0 ;i<this.arrStr.length;i++) {
			if(this.arrStr[i].equals(str)) {
				return i ;
			}
		}
		return -1;
	}

	
}
