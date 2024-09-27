public class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        super(1);
    }

    public int getArea() {
        return (int) (radius * radius * 3.14);
    }

    public void setRadius(int radius) {
        this.radius = radius;

    }
    public int getRadius(int radius) {
        return radius;

    }

    public static void main(String[] args) {
    }
}