package Practice.corejava;

public class Box {

	int a=1;
	int b=1;
	int c=1;
	
	 Box(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	Box( Box old){
		this.a=2;
		this.b=2;
		this.c=3;
	}
	Box(int  side){
		super();
		this.a=side;
		this.b=side;
		this.c=side;
	}
	
}
