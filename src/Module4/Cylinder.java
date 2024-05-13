package Module4;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    
    public String toString() {
        return "Cylinder - Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}