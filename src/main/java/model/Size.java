package model;

import java.util.Objects;

public class Size {
    private double length;
    private double width;
    private double perimeter;

    public Size() {
    }

    public Size(double length, double width) {
        this.length = length;
        this.width = width;
        this.setPerimeter();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        setPerimeter();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        setPerimeter();
    }

    public double getPerimeter() {
        return perimeter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Size)) return false;
        Size size = (Size) o;
        return Double.compare(size.getLength(), getLength()) == 0 &&
                Double.compare(size.getWidth(), getWidth()) == 0 &&
                Double.compare(size.getPerimeter(), getPerimeter()) == 0;
    }

    private void setPerimeter() {
        perimeter = getLength() + getWidth() * 2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth(), getPerimeter());
    }

    @Override
    public String toString() {
        return "Size{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + perimeter +
                '}';
    }

}
