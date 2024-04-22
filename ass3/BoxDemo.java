class Box {
    private double length;
    private double width;
    private double height;
    public Box() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }
    public Box(Box otherBox) {
        this.length = otherBox.length;
        this.width = otherBox.width;
        this.height = otherBox.height;
    }
    public void display() {
        System.out.println("Box Dimensions - Length: " + length + " | Width: " + width + " | Height: " + height);
    }
}

public class BoxDemo{
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("Box 1 (Default Constructor):");
        box1.display();
        Box box2 = new Box(3.0, 4.0, 5.0);
        System.out.println("\nBox 2 (Parameterized Constructor with all dimensions):");
        box2.display();
        Box box3 = new Box(2.5);
        System.out.println("\nBox 3 (Parameterized Constructor for a cube):");
        box3.display();
        Box box4 = new Box(box2);
        System.out.println("\nBox 4 (Copy Constructor from Box 2):");
        box4.display();
    }
}