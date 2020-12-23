package g01f01;

/**
 * Complex class. Stores the real and the imaginary values.
 *  add(), sub(), mult() functions.
 */
public class Complex {
    private Double r;
    private Double i;


    /**
     * Constructor of the Complex class
     * @param r Real values
     * @param i Imaginary values
     */
    public Complex(Double r, Double i) {
        this.r = r;
        this.i = i;
    }


    /**
     *
     * @return real value
     */
    public Double getR() {
        return r;
    }

    /**
     *
     * @return imaginary value
     */
    public Double getI() {
        return i;
    }

    /**
     *  Add two complex numbers
     * @param c Represents the other complex number
     * @return The addition of two complex numbers.
     */
    public Complex add(Complex c)
    {
        Double real = this.r + c.getR();
        Double im = this.i + c.getI();
        return new Complex(real, im);
    }

    /**
     * Subtract one complex number from another.
     * @param c The complex number we subtract with.
     * @return The subtruction of 2 complex numbers.
     */
    public Complex sub(Complex c)
    {
        Double real = this.r - c.getR();
        Double im = this.i - c.getI();
        return new Complex(real, im);
    }

    /**
     * Multiply 2 complex numbers.
     * @param c The complex number we multiply with.
     * @return Multiplication of 2 complex numbers.
     */
    public Complex mult(Complex c)
    {
        Double real = this.r * c.getR()-this.i * c.getI();
        Double im = this.r*c.getI() + this.i * c.getR();
        return new Complex(real, im);
    }

    /**
     * Overrides the toString() function for better readability.
     * @return Readable String.
     */
    @Override
    public String toString() {
        String result = "";
        result += this.r;
        if(this.i>=0)
            result += "+";

        result += this.i+"i";

        return result;
    }
}
