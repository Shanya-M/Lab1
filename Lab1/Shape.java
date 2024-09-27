abstract class Shape {
    /**
     * The number of sides within the shape.
     *
     * Uses ‘private’ visibility modifier . Could use ‘protected’ so it can be accessed by sub-classes.
     */
    private int sides;
    private int width;
    private int height;
    /**
     * Gets the number of sides within the shape.
     *
     * @return the number of sides within the shape.
     */
    public int getSides() {

        return sides;
    }

    public int getWidth() {

        return sides;
    }

    public int setWidth(int width) {
        this.width = width;
    }

    public int getHeight(int height) {
        return height;
    }

    public int setHeight(int height) {
        this.height = height;
    }


    /**
     * Sets the number of sides within the shape.
     *
     * @param sides the number of sides within the shape.
     */
    public void setSides(int sides) {
        this.sides = sides;// use this.sides to distinguish between parameter and attribute.
    }
    /**
     * Gets the size of the shapes area.
     *
     * @return the size of the shapes area.
     */
    abstract public int getArea();
    /**
     * Constructor.
     */
    Shape(int sides) {
        this.sides = sides;
    }
}
