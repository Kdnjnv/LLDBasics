package designPatterns.factoryPattern.shape;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                return new Circle();
        }
    }
}
