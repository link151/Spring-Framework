package spring01_2;

public class Draw {

	
	public void myDraw(Shape shape){
		shape.draw();
	}
	
	// ===============================
	private Shape shape;
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}
}
