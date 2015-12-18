package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() throws IllegalTriangle {
		if(getX() > 0 && getY() > 0) {
			return this.getX() * this.getY();	
		}
		else {
			throw new IllegalTriangle("X and Y must be positive integers!");
		}
	}

}
