package businessLayer;

import dataLayer.Data;

public class Div {

public int div(int a,int b) {
	Data aa=new Data();
	int c=a%b;
	aa.dat(a, b, c, "div");
	return c;
}
}
