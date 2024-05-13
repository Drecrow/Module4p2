package Module4;

public class ShapeArray {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cylinder cylinder = new Cylinder(3, 8);
        Cone cone = new Cone(4, 6);

        Shape[] shapeArray = {sphere, cylinder, cone};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}