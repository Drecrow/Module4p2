package Module4;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    
    public String toString() {
        return "Sphere - Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}