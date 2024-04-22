class Complex {
    private double real;
    private double imag;
    private static int numberOfComplexNumbers = 0;
    public Complex() {
        real = 0.0;
        imag = 0.0;
        numberOfComplexNumbers++;
    }
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
        numberOfComplexNumbers++;
    }
    public static int getNumberOfComplexNumbers() {
        return numberOfComplexNumbers;
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imag * other.imag;
        double newImag = this.real * other.imag + this.imag * other.real;
        return new Complex(newReal, newImag);
    }
    public double modulus() {
        return Math.sqrt(real * real + imag * imag);
    }
    public Complex conjugate() {
        return new Complex(real, -imag);
    }
    public void display() {
        System.out.println("Complex Number: " + real + " + " + imag + "i");
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex complex1 = new Complex(2.0, 3.0);
        Complex complex2 = new Complex(1.5, 2.5);
        System.out.println("Number of Complex Numbers Created: " + Complex.getNumberOfComplexNumbers());
        System.out.println("\nComplex Number 1:");
        complex1.display();
        System.out.println("\nComplex Number 2:");
        complex2.display();
        Complex sum = complex1.add(complex2);
        System.out.println("\nSum of Complex Numbers:");
        sum.display();

        Complex difference = complex1.subtract(complex2);
        System.out.println("\nDifference of Complex Numbers:");
        difference.display();

        Complex product = complex1.multiply(complex2);
        System.out.println("\nProduct of Complex Numbers:");
        product.display();
        System.out.println("\nModulus of Complex Number 1: " + complex1.modulus());
        System.out.println("Conjugate of Complex Number 2:");
        complex2.conjugate().display();
    }
}
