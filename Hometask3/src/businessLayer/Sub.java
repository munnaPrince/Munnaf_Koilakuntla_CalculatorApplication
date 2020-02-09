package businessLayer;

import dataLayer.Data;

public class Sub {
	public int sub(int a,int b) {
		Data aa=new Data();
		int c=a-b;
		aa.dat(a, b, c, "subtraction");
		return c;
	}
}
