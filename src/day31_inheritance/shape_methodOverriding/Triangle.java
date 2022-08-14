package day31_inheritance.shape_methodOverriding;

public class Triangle extends Shape{

    private double baseLength, height, sideLength1, sideLength2;

    public Triangle(double baseLength, double height,double sideLength1,double sideLength2) {
        setBaseLength(baseLength);
        setHeight(height);
        setSideLength1(sideLength1);
        setSideLength2(sideLength2);
    }


    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideLength1() {
        return sideLength1;
    }

    public void setSideLength1(double sideLength1) {
        this.sideLength1 = sideLength1;
    }

    public double getSideLength2() {
        return sideLength2;
    }

    public void setSideLength2(double sideLength2) {
        this.sideLength2 = sideLength2;
    }

    @Override
    public double area() {
        return baseLength*height/2;
    }

    @Override
    public double perimeter() {
        return baseLength+sideLength1+sideLength2;
    }

    @Override
    public void draw() {
        for (int i = 0; i < 5; i++)
            System.out.println("    *********".substring(i, 5 + 2*i));
        }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                "base length='" + getBaseLength() + '\'' +
                "height='" + getHeight() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}

