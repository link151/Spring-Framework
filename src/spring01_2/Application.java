package spring01_2;

public class Application {
	
	public static void main(String[] args) {

		Draw draw = new Draw();
		Shape shape = new Circle();
		System.out.println("使用接口");
		shape.draw();
		System.out.println("使用方法参数");
		draw.myDraw(shape);
		System.out.println("使用类的成员变量");
		draw.setShape(shape);
		draw.drawShape();
		
		shape = new Trangle();
		System.out.println("使用接口");
		shape.draw();
		System.out.println("使用方法参数");
		draw.myDraw(shape);
		System.out.println("使用类的成员变量");
		draw.setShape(shape);
		draw.drawShape();
	}

}
