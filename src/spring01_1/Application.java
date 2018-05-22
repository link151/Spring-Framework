package spring01_1;

public class Application {

	public static void main(String[] args) {

		Shape shape = new Circle();
		shape.draw();
		shape = new Shape();
		shape.draw();
		shape = new Trangle();
		shape.draw();
	}

}
