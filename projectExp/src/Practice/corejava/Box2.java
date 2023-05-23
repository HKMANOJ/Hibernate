package Practice.corejava;

public class Box2 extends Box1{

	int weight;
	public Box2(int a, int b, int c, double we) {
		super(a, b, c, we);
	this.weight=weight;
	}

	Box2(Box2  old){
		super(old);
		weight=old.weight;
	}
	
	
}
