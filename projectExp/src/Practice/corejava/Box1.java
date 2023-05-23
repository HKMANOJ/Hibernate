package Practice.corejava;

public class Box1 extends Box{
int wi=4;
	public Box1(int a, int b, int c,int we) {
		super(a, b, c);
		this.wi= we;
	}
	
	Box1(Box1 other){
		super(other);
		wi=other.wi;
	}
	
	

}
