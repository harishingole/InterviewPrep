package designpattern.factory;

public class ShapeFactory {
	
	public Shape createShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		return null;
	}
}
