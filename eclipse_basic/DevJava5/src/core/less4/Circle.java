package core.less4;

public class Circle implements RoundGeometric{
	
	private int r;
	
	public Circle(int r){
		this.r = r;
	}

	@Override
	public double square() {
		return Pi*r*r;
	}

	@Override
	public double perimetr() {
		return 2*Pi*r;
	}
}
