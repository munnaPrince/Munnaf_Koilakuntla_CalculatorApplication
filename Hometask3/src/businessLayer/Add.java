package businessLayer;

import dataLayer.Data;

public class Add {
	
public int add(int a,int b) {
	Data aa=new Data();
	int c=a+b;
	
	aa.dat(a, b, c, "addition");
	return c;
}


}
