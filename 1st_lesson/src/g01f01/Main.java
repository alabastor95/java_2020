package g01f01;

/**
 * Task: write 2 classes and a main function for testing
 * class 1: 2D Vector, stores x,y values (through const). scalar() , length()
 * class 2: Complex numbers, add(), sub(), mult()
 * @author Jonas Veress
 */
public class Main {
    public static void main(String[] args) {

        Vector2D v1 = new Vector2D(1.0, 3.0);
        Vector2D v2 = new Vector2D(3.0, 4.0);

        System.out.println("Testing vector: vector length:\n" +
                "The expected value is: 5.0. This is the result: " + v2.len());
        System.out.println("Testing vector: scalar product:\n" +
                "The expected value is: 15.0. This is the result: " + v2.scalar(v1));

        Complex c1 = new Complex(1.0,1.0);
        Complex c2 = new Complex(5.0, -3.0);
        System.out.println("Testing Complex: toString:\n" +
                "Expected: 5.0-3.0i . Result: "+ c2);
        System.out.println("Testing Complex: add:\n" +
                "Expected: 6.0-2.0i . Result: " + c1.add(c2));
        System.out.println("Testing Complex: sub: \n" +
                "Expected: -4.0+4.0i . Result: " + c1.sub(c2));
        System.out.println("Testing Complex: mult: \n" +
                "Expected: 8.0+2.0i . Result: " + c1.mult(c2));

    }
}
