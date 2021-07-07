package model;

import java.util.Objects;

public class Size {
    private float length;
    private float width;
    private float perimeter;

    public Size() {
    }

    public Size(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getPerimeter() {
        return (getLength()+getWidth())*2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Size)) return false;
        Size size = (Size) o;
        return Float.compare(size.getLength(), getLength()) == 0 &&
                Float.compare(size.getWidth(), getWidth()) == 0 &&
                Float.compare(size.getPerimeter(), getPerimeter()) == 0;
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
