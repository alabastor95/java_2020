package g01f01;

/**
 * Vector class. Stores x, y which you can initialize in the constructor.
 * Calculates length and scalar product
 */
public class Vector2D {
    private Double x;
    private Double y;

    /**
     * Constructor of Cector2D class.
     * @param x x Coord of the vector
     * @param y y Coord of the vector
     */
    public Vector2D(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates the length of a vector
     * @return double which represents the length of the vector.
     */
    public Double len()
    {
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    /**
     * Function used for creating scalar product with another vector.
     * @param toMult Represents the other vector which we use for scalar product.
     * @return The scalar product of 2 vectors.
     */
    public Double scalar(Vector2D toMult)
    {
        Double result = 0.0;
        result = this.x*toMult.getX() + this.y*toMult.getY();
        return result;
    }

    /**
     * @return The x value
     */
    public Double getX() {
        return x;
    }

    /**
     * @return The y value
     */
    public Double getY() {
        return y;
    }
}
