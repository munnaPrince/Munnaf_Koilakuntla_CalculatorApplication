package businessLayer;

import dataLayer.Data;

public class Mul {
	public int mul(int a,int b) {
		Data aa=new Data();
		int c=a*b;
		aa.dat(a, b, c, "multiply");
		return c;
	}
}
