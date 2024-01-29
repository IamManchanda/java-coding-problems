public class Solution {
    public void printComplexNumbersCalculations(int a, int b, int x, int y) {
        Complex c = new Complex(a, b);
        Complex d = new Complex(x, y);

        Complex e = Complex.add(c, d);
        System.out.print("Addition: ");
        e.printComplex();
        System.out.println();

        Complex f = Complex.diff(c, d);
        System.out.print("Difference: ");
        f.printComplex();
        System.out.println();

        Complex g = Complex.product(c, d);
        System.out.print("Product: ");
        g.printComplex();
        System.out.println();
    }
}

class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imaginary + b.imaginary);
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imaginary - b.imaginary);
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(
                (a.real * b.real) - (a.imaginary * b.imaginary),
                (a.real * b.imaginary) + (a.imaginary * b.real));
    }

    public void printComplex() {
        if (this.real == 0 && this.imaginary != 0) {
            System.out.print(this.imaginary + "i");
        } else if (this.real != 0 && this.imaginary == 0) {
            System.out.print(this.real);
        } else {
            System.out.print(this.real + " + " + this.imaginary + "i");
        }
    }
}

/*
 * Enter `a` (first real number):
 * 7
 * 
 * Enter `b` (first imaginary number):
 * 8
 * 
 * Enter `x` (second real number):
 * 8
 * 
 * Enter `y` (second imaginary number):
 * 9
 * 
 * Result:
 * Addition: 15 + 17i
 * Difference: -1 + -1i
 * Product: -16 + 127i
 */
