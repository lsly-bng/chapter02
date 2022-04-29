package com.javaex.ex14;

public class Ex14 {

	public static void main (String[]args) {
		
		Rectangle [] rec = new Rectangle[2];
		Circle [] cir = new Circle [2];
		Triangle [] tri = new Triangle [2];
		
		rec[0] = new Rectangle ("빨강","검정",4,4);
		rec[1] = new Rectangle ("주황","검정",5,5);
		
		tri[0]= new Triangle ("빨강", "검정",4,4);
		tri[1]= new Triangle ("보라", "검정", 10, 10);
		
		cir[0] = new Circle ("보라","빨강",3);
		cir[1] = new Circle ("보라","검정",3);
		
		for (int i=0; i<rec.length; i++) {
			rec[i].draw();
		}
		for (int i=0; i<tri.length; i++) {
			tri[i].draw();
		}
		for (int i=0; i<cir.length; i++) {
			cir[i].draw();
		}
	}
}
