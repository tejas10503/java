class Box {
    private int height;
    private int width;
    private int depth;
    public Box() {
        height = 1;
        width = 1;
        depth = 1;
    }
    public Box(int h, int w, int d) {
        height = h;
        width = w;
        depth = d;
    }
    public Box(Box otherBox) {
        this.height = otherBox.height;
        this.width = otherBox.width;
        this.depth = otherBox.depth;
    }
    public int calculateSurfaceArea() {
        return 2 * (height * width + width * depth + depth * height);
    }
    public int calculateSurfaceArea(boolean includeTopAndBottom) {
        if (includeTopAndBottom) {
            return calculateSurfaceArea(); 
        } else {
            return 2 * (height * width + width * depth); 
        }
    }
    public int calculateSurfaceArea(int side) {
        return 6 * side * side; 
    }
    public boolean isEqualDimensions(Box otherBox) {
        return this.height == otherBox.height && this.width == otherBox.width && this.depth == otherBox.depth;
    }
}

public class Demo {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("Box 1 (Default Constructor): Surface Area = " + box1.calculateSurfaceArea());
        Box box2 = new Box(3, 4, 5);
        System.out.println("\nBox 2 (Parameterized Constructor with height, width, and depth): Surface Area = " + box2.calculateSurfaceArea());
        Box box3 = new Box(box2);
        System.out.println("\nBox 3 (Clone of Box 2 using Copy Constructor): Surface Area = " + box3.calculateSurfaceArea());
        if (box2.isEqualDimensions(box3)) {
            System.out.println("\nBox 2 and Box 3 have equal dimensions.");
        } else {
            System.out.println("\nBox 2 and Box 3 do not have equal dimensions.");
        }
        System.out.println("\nBox 2 Surface Area (Excluding Top and Bottom): " + box2.calculateSurfaceArea(false));
        System.out.println("Surface Area of a Cube with side 4: " + box2.calculateSurfaceArea(true));
    }
}