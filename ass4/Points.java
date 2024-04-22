import java.lang.Math;

class Point {
    private double x;
    private double y;
    public Point() {
        x = 0.0;
        y = 0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double calculateDistance(Point p1, Point p2) {
        double deltaX = p2.x - p1.x;
        double deltaY = p2.y - p1.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

public class Points {
    public static void main(String[] args) {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(4.0, 6.0);
        System.out.println("Point 1:");
        point1.display();
        System.out.println("\nPoint 2:");
        point2.display();
        double distance = Point.calculateDistance(point1, point2);
        System.out.println("\nDistance between Point 1 and Point 2: " + distance);
    }
}
