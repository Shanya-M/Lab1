public class Rectangle extends Shape{
    @Override


    private int width;
    private int height;

    Rectangle(){
        super(4);
    }

    public int getArea() {
        return  width* height ;
    }

    public int setWidth(int width) {
        return width;
    }

    public int setHeight(int height) {
        return height;
    }

    public static void main(String[] args) {

    }


}
