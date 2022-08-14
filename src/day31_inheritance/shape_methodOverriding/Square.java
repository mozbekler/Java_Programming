package day31_inheritance.shape_methodOverriding;

public class Square extends Shape{

    private int side;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                "side='" + getSide() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
